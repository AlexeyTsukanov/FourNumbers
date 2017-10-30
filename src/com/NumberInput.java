package com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberInput {
    private int[] numbers = new int[4];

    public NumberInput() {
        numbers = testInt();
    }

    public boolean checkNumbers() {
        try {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = numbers.length - 1; j > i; j--) {
                    if (numbers[i] == numbers[j]) {
                        System.out.println("Вы ввели повторяющееся числа! \nПовторите ввод! ");
                        return false;
                    }
                }
            }
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }

    public static int[] testInt() {
        Scanner scanner = new Scanner(System.in);
        String tNInt;
        String stringPattern = "[\\d]";
        System.out.println("Введите число!");
        int[] numb = new int[4];
        tNInt = scanner.next();
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(tNInt);
        int i = 0;
        if (checkForInt(tNInt)) {
            return null;
        }
        while (matcher.find()) {
            String s = matcher.group();
            numb[i] = Integer.valueOf(s);
            i++;
        }
        return numb;
    }

    public int[] getNumbers() {
        return numbers;
    }

    private static boolean checkForInt(String str) {
        String stringPattern = "[\\D]";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find()) {
            i++;
        }
        return (i>0);
    }
}
