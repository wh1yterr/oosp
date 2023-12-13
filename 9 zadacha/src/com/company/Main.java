package com.company;

import java.util.HashMap;
import java.util.Map;
//Задача №9 Вариант 12
public class Main {
    public static void main(String[] args) {
        UserSessionManager userManager = UserSessionManager.getInstance();

        // Регистрация пользователей
        userManager.registerUser("Иван", "123");
        userManager.registerUser("Сергей", "321");

        // Попытка входа
        userManager.login("Иван", "123");
        userManager.login("Сергей", "654"); // Неправильный пароль

        // Выход
        userManager.logout("1234567890"); // Замените на существующий session ID
    }
}
