package com.company;

import java.util.Scanner;
import java.util.Stack;
// Задача №8 Вариант 2
public class Main {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Выберите действие:");
            System.out.println("1. Изменить уровень громкости");
            System.out.println("2. Сохранить уровень громкости");
            System.out.println("3. Отменить последнее изменение уровня громкости");
            System.out.println("4. Выйти из программы");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите новый уровень громкости (от 0 до 100):");
                    int newVolume = scanner.nextInt();
                    if (newVolume >= 0 && newVolume <= 100) {
                        player.setVolume(newVolume);
                    } else {
                        System.out.println("Некорректный уровень громкости. Уровень должен быть от 0 до 100.");
                    }
                    break;
                case 2:
                    player.saveVolumeLevel();
                    break;
                case 3:
                    player.undoVolumeLevel();
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Некорректный ввод.");
                    break;
            }
        }

        scanner.close();
    }
}
