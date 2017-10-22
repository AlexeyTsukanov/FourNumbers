package com;

public class Start {
    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();
        while (true){
            NumberInput numberInput = new NumberInput();
            numberInput.equals(randomNumber);
            numberInput.check();
            if (numberInput.getA() == 4){
                break;
            }
        }
    }
}
