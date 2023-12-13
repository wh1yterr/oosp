package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
//Задача №1 Вариант 12
public class Main {
    public static void main(String[] args) {
        CardFactory cardFactory = new PlayingCardFactory();
        Scanner s = new Scanner(System.in);
        System.out.println("Введите колличество карт");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            Card card = cardFactory.createCard();
            card.displayCard();
        }
    }
}
