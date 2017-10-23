package com;

public class Game {
    public static void main(String[] args) {
        int[] randomNumber = new int[4];
        for (int i = 0; i < 4; i++) {
            randomNumber[i] = RandomNumber.getRandomNumbers();
        }
        RandomNumber.check(randomNumber);
        while (true){
            NumberInput numberInput = new NumberInput();
            numberInput.equals(randomNumber);
            if (numberInput.checkNumbers()){
                numberInput.check();
                if (numberInput.getA() == 4){
                    break;
                }
            }
        }
    }
}
