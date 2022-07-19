package com.week01;

public class HomeworkArray {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 5, 2, 3, 4, 1};
        int temp = 0;

        for (int j = 0; j < 6; j++)
        {
            for (int i = 0; i < 5 - j; i++)
            {
                if (arr[i] >= arr[i + 1])
                {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i <= 5; i++)
            System.out.println(arr[i]);
    }
}
