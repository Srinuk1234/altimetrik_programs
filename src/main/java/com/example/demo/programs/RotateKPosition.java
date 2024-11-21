package com.example.demo.programs;

public class RotateKPosition {

    public static void rotateKPositionToLeft(int arr[], int n, int k) {
        if (n == 0) {
            System.out.println("Array Should be contain values");
            return;
        }
        if (k > n) {
            System.out.println("K Position Should not be greater than array length");
            return;
        }
        // {3, 4, 5, 6, 7, 1, 2};
        // {6, 7, 1, 2, 3, 4, 5};
        // {1, 2, 3, 4, 5, 6, 7};
        int[] temp=new int[k];
        // {6, 7}; 0, 1
        for (int i = 0; i < k; i++)
        {
            temp[i] = arr[i];
        }
        // {1, 2, 3, 4, 5, 6, 7}; fist in(0) - 3
        // 1st index - 4
        // {3, 4, 5, 6, 7, 6, 7};
        for (int i = k; i < n; i++)
        {
            arr[i - k] = arr[i];
        }

        // {3, 4, 5, 6, 7, 1, 2};
        for (int i = n- k; i < n; i++)
        {
            arr[i] = temp[i - n + k];
        }
    }


}
