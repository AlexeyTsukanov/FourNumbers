package com;

public class Game {
    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();
        while (true) {
            NumberInput numberInput = new NumberInput();
            Score.scoreCheck(randomNumber, numberInput);
            if (Score.scoreCheck(randomNumber, numberInput) == 4) {
                break;
            }
        }
    }
}
