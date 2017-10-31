package com;

public abstract class Number {
    public boolean checkNumber(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
