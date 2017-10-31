package com;

public class Score {
    private static int a, b;

    public static void scoreCheck(RandomNumber randomNumber, NumberInput number) {
        int[] number1 = number.getNumbers();
        int[] number2 = randomNumber.getRandomNumber();
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
    }

    public static int getB() {
        return b;
    }

    public static void setA(int a) {
        Score.a = a;
    }

    public static void setB(int b) {
        Score.b = b;
    }
}
