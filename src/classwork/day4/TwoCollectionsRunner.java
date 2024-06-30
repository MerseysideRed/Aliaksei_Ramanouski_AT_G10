package classwork.day4;

import java.util.Arrays;
import java.util.List;

public class TwoCollectionsRunner {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("мама", "мыла", "раму", "чисто", "мама");
        List<Person> people = Arrays.asList(new Person("Вася", 13, Person.Sex.MAN), new Person("Катя", 28, Person.Sex.WOMEN), new Person("Вова", 24, Person.Sex.MAN), new Person("Маша", 38, Person.Sex.WOMEN), new Person("Роман Петрович", 72, Person.Sex.MAN));

        List<String> newWords = words.stream().sorted().toList();
        newWords.forEach(s -> System.out.print(s + " "));

        System.out.println();

        List<String> newWords2 = words.stream().sorted((s1, s2) -> -s1.compareTo(s2)).distinct().toList();
        newWords2.forEach(s -> System.out.print(s + " "));

        System.out.println();

        List<Person> peopleList = people.stream().sorted((person1, person2) -> {
            if (person1.getSex().compareTo(person2.getSex()) == 0) {
                return person1.getSex().compareTo(person2.getSex());
            } else
                return person1.getSex().compareTo(person2.getSex());
        }).peek(System.out::println).toList();
    }
}
