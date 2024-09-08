package ru.test;

import java.util.Scanner;

public class Name {
    public static void main(String[] nameVyacheslav) {
        System.out.print("Введите любое имя: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
