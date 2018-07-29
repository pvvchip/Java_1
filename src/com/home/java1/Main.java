package com.home.java1;

public class Main {

    public static void main(String[] args) {

//* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//* Конструктор класса должен заполнять эти поля при создании объекта;
//* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//* Создать массив из 5 сотрудников
//        Пример:
//        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//        persArray[1] = new Person(...);
//...
//        persArray[4] = new Person(...);
//
//* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

        Person[] man = new Person[5];
        man[0] = new Person("Petrov Ivan Ivanovich", "Engineer", "petrov@mail.ru", 4956526565L, 100000, 30);
        man[1] = new Person("Dolgov Ivan Ivanovich", "Engineer", "petrov@mail.ru", 4956526565L, 100000, 41);
        man[2] = new Person("Sidorov Ivan Ivanovich", "Engineer", "petrov@mail.ru", 4956526565L, 100000, 45);
        man[3] = new Person("Pot Ivan Ivanovich", "Engineer", "petrov@mail.ru", 4956526565L, 100000, 36);
        man[4] = new Person();

        for (Person iMan : man) {
            if (iMan.getAge() > 40) iMan.printPerson();
        }
    }
}
