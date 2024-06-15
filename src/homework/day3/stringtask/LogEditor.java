package homework.day3.stringtask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogEditor {
    public static void editLog(String string) {
        String[] wholeLines = string.split("\n");

        String regex = "\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b";
        Pattern pattern = Pattern.compile(regex);

        String[] uniqueIps = new String[wholeLines.length];
        int[] successCount = new int[wholeLines.length];
        int[] failCount = new int[wholeLines.length];
        int foundUniqueIPsIndex = 0;

        for (String line : wholeLines) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String ip = matcher.group();
                int index = findIndex(uniqueIps, ip, foundUniqueIPsIndex);
                if (index == -1) {
                    uniqueIps[foundUniqueIPsIndex] = ip;
                    if (line.contains("granted")) {
                        successCount[foundUniqueIPsIndex]++;
                    } else if (line.contains("denied")) {
                        failCount[foundUniqueIPsIndex]++;
                    }
                    foundUniqueIPsIndex++;
                } else {
                    if (line.contains("granted")) {
                        successCount[index]++;
                    } else if (line.contains("denied")) {
                        failCount[index]++;
                    }
                }
            }
        }

        for (int i = 0; i < foundUniqueIPsIndex; i++) {
            System.out.printf("ip %s: ok - %d, failed - %d\n", uniqueIps[i], successCount[i], failCount[i]);
        }
    }

    private static int findIndex(String[] uniqueIps, String ip, int foundUniqueIPsIndex) {
        for (int i = 0; i < foundUniqueIPsIndex; i++) {
            if (uniqueIps[i] != null && uniqueIps[i].equals(ip)) {
                return i;
            }
        }
        return -1;
    }
}

