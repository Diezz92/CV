package ru.test;

import java.util.Scanner;

public class MoreThanSeven {

    public static void main(String[] hello) {
        System.out.print("Введите любое число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        } else {
        }
    }
}
