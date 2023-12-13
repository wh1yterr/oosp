package com.company;

import java.util.ArrayList;
import java.util.List;

class Menu {
    private List<String> items;

    public Menu() {
        items = new ArrayList<String>();
        items.add("Пицца");
        items.add("Салат");
        items.add("Суп");
        items.add("Десерт");
    }

    public void displayMenu() {
        System.out.println("Меню:");
        for (String item : items) {
            System.out.println(item);
        }
    }

    public boolean isValidItem(String item) {
        return items.contains(item);
    }
}
