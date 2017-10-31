package com;

public class Game {
    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();
        while (true) {
            NumberInput numberInput = new NumberInput();
            Score.scoreCheck(randomNumber, numberInput);
            if (Score.getB() == 4) {
                break;
            }
            Score.setA(0);
            Score.setB(0);
        }
    }
}
