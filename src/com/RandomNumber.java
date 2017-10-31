package com;

public class RandomNumber extends Number {
    private int[] randomNumber;

    public RandomNumber() {
        randomNumber = setRandomNumber();
    }

    private int[] setRandomNumber() {
        int[] numb = new int[4];
        do {
            for (int i = 0; i < 4; i++) {
                numb[i] = (int) (Math.random() * 10);
            }
        } while (this.checkNumber(numb));

        return numb;
    }

    public int[] getRandomNumber() {
        return randomNumber;
    }
}
