package com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberInput {
    private int[] numbers = new int[4];

    public NumberInput(){
        for (int i = 0; i < 4; i++){
            numbers = testInt();
        }
    }
    public boolean checkNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("Вы ввели повторяющееся числа! \nПовторите ввод! ");
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] testInt() {
        Scanner scanner = new Scanner(System.in);
        int timeNumb;
        String tNInt;
        String stringPattern = "\\d";
        System.out.println("Введите число!");
        int[] numb = new int[4];
        while (true) {
            if (scanner.hasNextInt()) {
                timeNumb = scanner.nextInt();
                if (timeNumb >= 1000 & timeNumb < 9999) {
                    break;
                }
                else {
                    System.out.println("Введенное число не соответствует условию.");
                }
            } else {
                System.out.println("Вы ввели не целое число!");
                scanner.next();
            }
        }
        tNInt = Integer.toString(timeNumb);
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(tNInt);
        for (int i = 0; i < 4; i++){
            String s = matcher.group();
            numb[i] = Integer.valueOf(s);
        }
        return numb;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
