package ru.geekbrains.java1.lesson5;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Employee() {
    }

    public Employee(String surname, String name, String patronymic, String position, String email, String telephone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public static void printEmployee(Employee employee){
        System.out.println(employee.toString());
    }

    public static void arrayEmployee(Employee... array) {
      for (int i = 0; i < array.length; i++){
          if(array[i].age > 40){
              System.out.println(array[i].toString());
          }else{
              System.out.println("сотрудники младше или равные 40 годам\n"
              + "не показываются");
          }
          System.out.println();
      }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}