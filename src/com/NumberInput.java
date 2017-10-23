package com;

import java.util.Scanner;

public class NumberInput {
    private int[] numbers = new int[4];
    private int a = 0, b = 0;

    public NumberInput(){
        for (int i = 0; i < 4; i++){
            numbers[i] = testInt();
        }
    }

    public static int testInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число!");
        int numb;
        while (true) {
            if (scanner.hasNextInt()) {
                numb = scanner.nextInt();
                if (numb >= 0 & numb < 10) {
                    break;
                }
                else {
                    System.out.println("Введите число от 0 до 9.");
                }
            } else {
                System.out.println("Вы ввели не целое число!");
                scanner.next();
            }
        }
        return numb;
    }

    public void equals(int[] randomNumber){
        for (int i = 0; i < randomNumber.length; i++){
            for (int q = 0; q < numbers.length; q++ ){
                if (i == q & randomNumber[i] == numbers[q]){
                    b++;
                    a++;
                    break;
                }
                if (i != q & randomNumber[i] == numbers[q]){
                    a++;
                    break;
                }
            }
        }
    }

    public void check(){
        System.out.println(a + " : " + b);
    }

    public int getA() {
        return b;
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
}
