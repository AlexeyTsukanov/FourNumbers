package com;

public class RandomNumber {
    private int[] randomNumbers = new int[4];

    public RandomNumber(){
        for (int i = 0; i < randomNumbers.length; i++){
            randomNumbers[i] = (int)(Math.random()*5);
        }
    }

    public int[] getRandomNumbers() {
        return randomNumbers;
    }
}
