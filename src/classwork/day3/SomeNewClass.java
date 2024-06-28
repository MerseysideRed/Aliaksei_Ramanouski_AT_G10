package classwork.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SomeNewClass {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("мама", "мыла", "раму", "чисто", "мама");
        numbers.stream().filter(x -> x.equals("мама")).count();
        String s = numbers.stream().findFirst().orElse("мама");
        System.out.println(s);
        String p = numbers.stream().filter(s1 -> s1.equals("мама")).findFirst().get();
        System.out.println(p);
        String f = numbers.stream().skip(4).findFirst().get();
        List<String> listString = numbers.stream().skip(2).limit(2).collect(Collectors.toList());
        List<String> listString2 = numbers.stream().distinct().filter(a -> a.contains("м")).collect(Collectors.toList());
    }
}

