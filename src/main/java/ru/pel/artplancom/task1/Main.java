package ru.pel.artplancom.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        String str = new Scanner(System.in).nextLine();
        StringReverser reverser = new StringBuilderReverser();

        System.out.println(str);
        System.out.println(reverser.reverse(str));

        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            reverser.reverse(str);
        }
        System.out.println(System.nanoTime() - startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < 10_000; i++) {
            reverser.reverse(str);
        }
        System.out.println(System.nanoTime() - startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            reverser.reverse(str);
        }
        System.out.println(System.nanoTime() - startTime);
    }
}
