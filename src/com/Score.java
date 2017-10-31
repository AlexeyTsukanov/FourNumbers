package com;

public class Score {
    public static int scoreCheck(RandomNumber randomNumber, NumberInput number) {
        int[] number1 = number.getNumbers();
        int[] number2 = randomNumber.getRandomNumber();
        int a = 0, b = 0;
            for (int i = 0; i < randomNumber.getRandomNumber().length; i++) {
                for (int q = 0; q < number1.length; q++) {
                    if (i == q & number2[i] == number1[q]) {
                        b++;
                        a++;
                        break;
                    }
                    if (i != q & number2[i] == number1[q]) {
                        a++;
                        break;
                    }
                }
            }
            System.out.println(a + " : " + b);
            return b;
    }

}
