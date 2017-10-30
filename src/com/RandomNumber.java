package com;

public class RandomNumber {
    private RandomNumber() {
    }

    public static int getRandomNumbers() {
        return (int) (Math.random() * 10);
    }

    public static void check(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[i] == array[j]) {
                    array[j] = (int) (Math.random() * 10);
                    j = array.length - 1;
                    i = 0;
                }
            }
        }
    }

}
