package com.company;

import java.util.ArrayList;
import java.util.List;
//������ �12 ������� 5
public class Main {
    public static void main(String[] args) {
        MenuComponent mainMenu = new MenuCategory("�������� ����");
        MenuComponent salads = new MenuCategory("������");
        ((MenuCategory) salads).add(new MenuItem("������", 350));
        ((MenuCategory) salads).add(new MenuItem("���������", 300));

        MenuComponent soups = new MenuCategory("����");
        ((MenuCategory) soups).add(new MenuItem("����", 250));
        ((MenuCategory) soups).add(new MenuItem("���-�����", 300));

        MenuComponent desserts = new MenuCategory("�������");
        ((MenuCategory) desserts).add(new MenuItem("��������", 400));
        ((MenuCategory) desserts).add(new MenuItem("��������", 350));

        ((MenuCategory) mainMenu).add(salads);
        ((MenuCategory) mainMenu).add(soups);
        ((MenuCategory) mainMenu).add(desserts);

        mainMenu.print();
    }
}
