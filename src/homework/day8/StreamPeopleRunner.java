package homework.day8;

import homework.day6.SeparatedPOJOClasses.Person;

import java.io.*;
import java.util.stream.Stream;

public class StreamPeopleRunner {

    public static void main(String[] args) {
        Stream.of(new Person(32, "Коля"), new Person(24, "Оля"), new Person(55, "Вася"), new Person(63, "Маша"))
                .filter(person -> person.getAge() < 60)
                .sorted((person1, person2) -> person1.getName().compareTo(person2.getName()))
                .flatMap(person -> Stream.of(new Person(person.getAge() + 4, person.getName())))
                .mapToInt(person -> person.getAge())
                .average()
                .ifPresent(averageAge -> {
                    try (BufferedWriter out = new BufferedWriter(new FileWriter("newFileStreamPeople.txt"));) {
                        out.write("Average age of people stream: " + averageAge);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
    }
}
