package com.example.demo.programs;

import java.util.ArrayList;
import java.util.List;

public class LeaderFromArray {

    static List<Integer> leaders(int[] arr, int n) {
        List<Integer> result = new ArrayList<>();
        int j;
        for (int i = 0; i < n; i++) {

            // Check elements to the right
            for (j = i + 1; j < n; j++) {

                // If a larger element is found
                if (arr[i] < arr[j]) {
                    break;
                }
            }
            // If no larger element was found
            if (j == n)
                result.add(arr[i]);
        }

        return result;
    }


}
