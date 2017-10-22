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
        int numb = 0;
        if (scanner.hasNextInt()) {
            numb = scanner.nextInt();
        } else {
            System.out.println("Вы ввели не целое число!");
        }
        return numb;
    }

    public void equals(RandomNumber randomNumber){
        for (int i = 0; i < randomNumber.getRandomNumbers().length; i++){
            for (int q = 0; q < numbers.length; q++ ){
                if (i == q & randomNumber.getRandomNumbers()[i] == numbers[q]){
                    a++;
                }
                if (i != q & randomNumber.getRandomNumbers()[i] == numbers[q]){
                    b++;
                }
            }
        }
    }

    public void check(){
        System.out.println(a + " : " + b);
    }

    public int getA() {
        return a;
    }
}
