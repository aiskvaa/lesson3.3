package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {3.2, 4.1, 5.3, 2.6, -2.3, 3.1, 4.8, -7.1, 8.7, -6.3, 5.9, -7.1, 9.4, 3.6, 2.4, 6.7};
        double sum = 0;
        double num = 0;
        int kol = 0;
        for (double i : numbers) {
            if (i > 0 && kol > 0) {
                sum += i;
                num++;
            } else if (i < 0) {
                kol++;
            }
        }
        System.out.println("Среднее арифметическое " + sum / num);


    }
}

