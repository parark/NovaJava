package com.week01;

public class HomeworkPatternPrinting {
    public static void main(String[] args) {
        int a; // 줄 바꿈
        int b; // 별
        int c; // 공백

        for (a = 1; a <= 5; a++)
        {
            for (b = 1; b <= a; b++)
                System.out.print("*");

            for (c = 1+a; c <= 5; c++)
                System.out.print(" ");

            for (c = a; c <= 5-1; c++)
                System.out.print(" ");

            for (b = 5-1-a; b < 5-1; b++)
                System.out.print("*");

            System.out.print("\n");
        }

        for (a = 1; a <= 5-1; a++)
        {
            for (b = a; b <= 5-1; b++)
                System.out.print("*");

            for (c = 5-1-a; c < 5-1; c++)
                System.out.print(" ");

            for (c = 1; c <= a; c++)
                System.out.print(" ");

            for (b = 1+a; b <= 5; b++)
                System.out.print("*");

            System.out.print("\n");
        }
    }
}
