package homework.day6;

import homework.day6.SeparatedPOJOClasses.Person;

import java.util.ArrayList;
import java.util.List;

public class ListPersonsClass {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person(32, "Коля"));
        persons.add(new Person(24, "Оля"));
        persons.add(new Person(55, "Вася"));
        persons.add(new Person(63, "Маша"));

        for (Person person : persons) {
            System.out.print(person.getAge() + " ");
        }
        System.out.println();

        for (Person person : persons) {
            System.out.print(person.getName() + " ");
        }
        System.out.println();

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i).toString());
        }
    }
}
