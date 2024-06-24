package homework.day6;

import homework.day6.SeparatedPOJOClasses.Water;

import java.util.Arrays;
import java.util.List;

public class ListWaterClass {
    public static void main(String[] args) {
        List<Water> waters = Arrays.asList(new Water("Прозрачная", "Нет"), new Water("Прозрачная", "Нет"), new Water("Мутная", "Аммиачный"));

        for (Water water : waters) {
            System.out.println(water.getColor() + " - " + water.getSmell());
        }
    }
}
