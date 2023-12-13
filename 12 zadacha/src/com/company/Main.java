package com.company;

import java.util.ArrayList;
import java.util.List;
//Задача №12 Вариант 5
public class Main {
    public static void main(String[] args) {
        MenuComponent mainMenu = new MenuCategory("Основное меню");
        MenuComponent salads = new MenuCategory("Салаты");
        ((MenuCategory) salads).add(new MenuItem("Цезарь", 350));
        ((MenuCategory) salads).add(new MenuItem("Греческий", 300));

        MenuComponent soups = new MenuCategory("Супы");
        ((MenuCategory) soups).add(new MenuItem("Борщ", 250));
        ((MenuCategory) soups).add(new MenuItem("Суп-гуляш", 300));

        MenuComponent desserts = new MenuCategory("Десерты");
        ((MenuCategory) desserts).add(new MenuItem("Тирамису", 400));
        ((MenuCategory) desserts).add(new MenuItem("Пирожное", 350));

        ((MenuCategory) mainMenu).add(salads);
        ((MenuCategory) mainMenu).add(soups);
        ((MenuCategory) mainMenu).add(desserts);

        mainMenu.print();
    }
}
