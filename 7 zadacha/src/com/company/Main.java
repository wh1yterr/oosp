package com.company;
//������ �7 ������� 1
public class Main {

    public static void main(String[] args) {
        User user = new User.UserBuilder("����", "������", "zxc@example.com").age(30).build();
        System.out.println("���: " + user.getFirstName());
        System.out.println("�������: " + user.getLastName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("�������: " + user.getAge());
    }
}
