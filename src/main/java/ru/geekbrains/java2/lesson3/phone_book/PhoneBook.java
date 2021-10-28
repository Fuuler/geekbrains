package ru.geekbrains.java2.lesson3.phone_book;

import java.util.*;

public class PhoneBook {
    private String lastName;
    private String firstName;
    private String patronymic;
    private List phoneNumbers;
    private String address;

    private static List<PhoneBook> pb = new ArrayList<>();


    public PhoneBook(String lastName, String firstName,
                     String patronymic, List phoneNumbers,
                     String address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.phoneNumbers = phoneNumbers;
        this.address = address;
    }

    public PhoneBook() {
    }


    @Override
    public String toString() {
        return "PhoneBook{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", phoneNumbers='" + phoneNumbers + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void add(PhoneBook phoneBook) {
        pb.add(phoneBook);
    }


    public static void get(String name) {
        boolean isFound = false;
        for (PhoneBook user : pb) {
            if (user.firstName.equals(name)) {
                isFound = true;
                System.out.println("Найден " + user);
            }
        }
        if (!isFound) System.out.println("Не найдено имя " + name);
    }
}

