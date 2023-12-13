package com.company;

import java.util.HashMap;
import java.util.Map;
//Задача №11 Вариант 3
public class Main {
    public static void main(String[] args) {
        System.out.println("Персонажи:");
        Characters voker = new Invoker("Invoker", 22.5, 1800, 100, 100);
        Characters sf = new ShadowFiend("ShadowFiend", 12.3, 1500, 100, 100);
        Characters lion = new Lion("Lion", 18.0, 1000, 100, 100);
        Characters vokerClone = voker.clone();
        Characters sfClone = sf.clone();
        Characters lionClone = lion.clone();
        System.out.println(sf);
        System.out.println(lion);
        System.out.println(voker);
        System.out.println("Клоны:");
        System.out.println(sfClone);
        System.out.println(lionClone);
        System.out.println(vokerClone);
    }
}
