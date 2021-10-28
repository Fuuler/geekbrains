package ru.geekbrains.java2.lesson3.phone_book;

import java.util.List;

import static java.util.Arrays.asList;
import static ru.geekbrains.java2.lesson3.phone_book.PhoneBook.add;
import static ru.geekbrains.java2.lesson3.phone_book.PhoneBook.get;

public class RunPhoneBook {
    public static void main(String[] args) {
        PhoneBook name1 = new PhoneBook("Куликова", "Ирина", "Владимировна", asList("891600", "891700"),"город Лицо дом 1");
        PhoneBook name2 = new PhoneBook("Сергеев", "Василий", "Васильев", asList("891601", "891701"),"город Лицо дом 2");
        PhoneBook name3 = new PhoneBook("Ларин", "Петр", "Сергеевич", asList("891602", "891702"),"город Лицо дом 3");
        add(name1);
        add(name2);
        add(name3);
        get("Ирина"); //correct
        System.out.println();
        get("abc"); //incorrect

    }
}
