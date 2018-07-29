package com.home.java1;

class Person {
    private String name;
    private String post;
    private String email;
    private long phone;
    private int salary;
    private int age;

    int getAge() {
        return age;
    }

    Person(String name, String post, String email, long phone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    Person() {
        name = "Иванов Иван Иванович";
        post = "Программист";
        email = "ivanov@mail.ru";
        phone = 4951234565L;
        salary = 100000;
        age = 25;
    }

    void printPerson() {
        System.out.println("Имя:\t\t" + name);
        System.out.println("Должность:\t" + post);
        System.out.println("email:\t\t" + email);
        System.out.println("Телефон:\t" + phone);
        System.out.println("Зарплата:\t" + salary);
        System.out.println("Возраст:\t" + age);
        System.out.println();
    }
}
