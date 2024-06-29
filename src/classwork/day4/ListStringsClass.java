package classwork.day4;

import java.util.Arrays;
import java.util.List;

public class ListStringsClass {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("мама", "мыла", "раму", "чисто", "мама");

        boolean matchAnyMama = words.stream().anyMatch(s -> s.equals("мама"));
        System.out.println(matchAnyMama);

        boolean matchAllM = words.stream().allMatch(s -> s.contains("м"));
        System.out.println(matchAllM);

        List<String> newWords = words.stream().map(s -> s.concat("м")).toList();
        newWords.forEach(s -> System.out.print(s + " "));

        System.out.println();

        List<String> newWords2 = words.stream().flatMap(s -> Arrays.stream(s.split("а"))).filter(s -> !s.isEmpty()).toList();
        newWords2.forEach(s -> System.out.print(s + " "));
    }
}
