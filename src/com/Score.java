package com;

public class Score {
    private static int a,b;

    public static void scoreCheck(int[] randomNumber, NumberInput number){
        int[] numbers = number.getNumbers();
        for (int i = 0; i < randomNumber.length; i++){
            for (int q = 0; q < numbers.length; q++ ){
                if (i == q & randomNumber[i] == numbers[q]){
                    b++;
                    a++;
                    break;
                }
                if (i != q & randomNumber[i] == numbers[q]){
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
