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
                if (numb >= 1 & numb <= 4) {
                    break;
                }
            } else {
                System.out.println("Вы ввели не целое число!");
                scanner.next();
            }
        }
        return numb;
    }

    public void equals(RandomNumber randomNumber){
        for (int i = 0; i < randomNumber.getRandomNumbers().length; i++){
            for (int q = 0; q < numbers.length; q++ ){
                if (i == q & randomNumber.getRandomNumbers()[i] == numbers[q]){
                    a++;
                    numbers[i] = 0;
                    break;
                }
                if (i != q & randomNumber.getRandomNumbers()[i] == numbers[q]){
                    b++;
                    numbers[i] = 0;
                    break;
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
