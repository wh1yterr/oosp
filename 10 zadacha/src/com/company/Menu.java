package com.company;

import java.util.ArrayList;
import java.util.List;

class Menu {
    private List<String> items;

    public Menu() {
        items = new ArrayList<String>();
        items.add("�����");
        items.add("�����");
        items.add("���");
        items.add("������");
    }

    public void displayMenu() {
        System.out.println("����:");
        for (String item : items) {
            System.out.println(item);
        }
    }

    public boolean isValidItem(String item) {
        return items.contains(item);
    }
}
