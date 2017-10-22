package com;

public class RandomNumber {
    private int[] randomNumbers = new int[4];

    public RandomNumber(){
        for (int i = 0; i < randomNumbers.length; i++){
            randomNumbers[i] = rnd(1,4);
        }
    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public int[] getRandomNumbers() {
        return randomNumbers;
    }
}
