package ru.pel.artplancom.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        String str = new Scanner(System.in).nextLine();
//        StringReverser reverser = new StringBuilderReverser();
        StringReverser reverser = new StreamReverser();

        long startTime = System.nanoTime();
//        StringReverser sr = str1 -> new StringBuilder(str).reverse().toString();
        String reversedStr = reverser.reverse(str);
        long elapsedNanos = System.nanoTime() - startTime;

        System.out.println("Результат работы:");
        System.out.printf("%s %s %d", str, reversedStr, elapsedNanos);
    }
}
