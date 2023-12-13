package com.company;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int age; // ������ ������� ��������

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.age = builder.age;
    }

    // ������� ��� ������� ������������

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    // ����� Builder ��� �������� �������� ������������

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private int age;

        public UserBuilder(String firstName, String lastName, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        // ����� ��� �������� ������� ������������

        public User build() {
            return new User(this);
        }
    }
}
