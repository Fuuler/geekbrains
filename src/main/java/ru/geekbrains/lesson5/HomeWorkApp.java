package ru.geekbrains.lesson5;

public class HomeWorkApp {
    public static void main(String[] args) {
        /** Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.*/
         Employee employee = new Employee("Ivanov", "Ivan", "","Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
         employee.printEmployee(employee);

        /**. Создать массив из 5 сотрудников.*/
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov", "Ivan", "","Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Ivanov1", "Ivan1", "Ivanovich1","Engineer", "ivivan2@mailbox.com", "892312313", 40000, 35);
        persArray[2] = new Employee("Ivanov2", "Ivan2", "Ivanovich2","Engineer", "ivivan3@mailbox.com", "892312314", 50000, 40);
        persArray[3] = new Employee("Ivanov3", "Ivan3", "Ivanovich3","Engineer", "ivivan4@mailbox.com", "892312315", 60000, 41);
        persArray[4] = new Employee("Ivanov4", "Ivan4", "Ivanovich4","Engineer", "ivivan5@mailbox.com", "892312316", 70000, 39);

        /** С помощью цикла вывести информацию только о сотрудниках старше 40 лет. */
        Employee employee2 = new Employee();
        employee2.arrayEmployee(persArray);
    }
}
