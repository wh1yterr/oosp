package com.company;
//Задача №7 Вариант 1
public class Main {

    public static void main(String[] args) {
        User user = new User.UserBuilder("Иван", "Иванов", "zxc@example.com").age(30).build();
        System.out.println("Имя: " + user.getFirstName());
        System.out.println("Фамилия: " + user.getLastName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Возраст: " + user.getAge());
    }
}
