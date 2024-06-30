package classwork.day4;

import java.util.Arrays;
import java.util.List;

public class PersonRunner {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Вася", 13, Person.Sex.MAN), new Person("Катя", 28, Person.Sex.WOMEN), new Person("Вова", 24, Person.Sex.MAN), new Person("Маша", 38, Person.Sex.WOMEN), new Person("Роман Петрович", 72, Person.Sex.MAN));

        int counter = 0;
        for (Person person : people) {
            if ((person.getAge() > 17 && person.getAge() < 56 && person.getSex() == Person.Sex.WOMEN) || (person.getAge() > 17 && person.getAge() < 61 && person.getSex() == Person.Sex.MAN)) {
                counter++;
            }
        }
        System.out.println(counter);

        long validPeople = people.stream().filter(person -> (person.getAge() > 17 && person.getAge() < 56 && person.getSex() == Person.Sex.WOMEN) || (person.getAge() > 17 && person.getAge() < 61 && person.getSex() == Person.Sex.MAN)).count();

        System.out.println(validPeople);
    }
}
