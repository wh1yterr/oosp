package com.company;

import java.util.ArrayList;
import java.util.List;

class MenuCategory implements MenuComponent {
    private String name;
    private List<MenuComponent> components = new ArrayList<MenuComponent>();

    public MenuCategory(String name) {
        this.name = name;
    }

    public void add(MenuComponent component) {
        components.add(component);
    }

    @Override
    public void print() {
        System.out.println("_____________________________");
        System.out.println("Категория: " + name);
        for (MenuComponent component : components) {
            component.print();
        }

    }
}
