package homework.day7;

import homework.day7.SeparatedPOJOClasses.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListBooksClass {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Война и мир", "Толстой"));
        books.add(new Book("Преступление и наказание", "Достоевский"));
        books.add(new Book("Мастер и Маргарита", "Булгаков"));

        for (Book book : books) {
            System.out.print(book.getName() + " ");
        }
        System.out.println();

        Map<String, String> booksMap = new HashMap<>();

        for (Book book : books) {
            booksMap.put(book.getName(), book.getAuthor());
        }

        for (String name : booksMap.keySet()) {
            System.out.print((name + " "));
        }
        System.out.println();

        for (String author : booksMap.values()) {
            System.out.print((author + " "));
        }
        System.out.println();

        for (Map.Entry<String, String> entry : booksMap.entrySet()) {
            System.out.print((entry + " "));
        }
        System.out.println();
    }
}
