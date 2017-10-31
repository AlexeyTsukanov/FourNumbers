package com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberInput extends Number {
    private int[] numbers = new int[4];

    public NumberInput() {
        do {
            numbers = testInt();
        } while (checkNumber(numbers));

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
        while (matcher.find()) {
            if (i < 4) {
                String s = matcher.group();
                numb[i] = Integer.valueOf(s);
                i++;
            }
        }
        return numb;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
