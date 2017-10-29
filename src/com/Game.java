package com;

public class Game {
    public static void main(String[] args) {
        int[] randomNumber = new int[4];
        for (int i = 0; i < 4; i++) {
            randomNumber[i] = RandomNumber.getRandomNumbers();
        }
        RandomNumber.check(randomNumber);
        while (true) {
            NumberInput numberInput = new NumberInput();
            Score.scoreCheck(randomNumber, numberInput);
            if (numberInput.checkNumbers() & Score.getB() == 4) {
                break;
            }
            Score.setA(0);
            Score.setB(0);
        }
    }
}
