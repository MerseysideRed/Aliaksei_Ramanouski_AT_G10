package homework.day3.stringtask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CurrentDateFormat {
    public static void printCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM, yyyy, H часа m минут", Locale.forLanguageTag("ru"));

        String formattedDateTime = now.format(formatter);
        System.out.println("Сейчас на дворе: " + formattedDateTime);
    }
}

