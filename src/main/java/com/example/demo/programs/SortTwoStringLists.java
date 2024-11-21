package com.example.demo.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortTwoStringLists {
    public static List<String> sortTwoStringList(List<String> firstList, List<String> secondList) {
        return mergeTwoSortedList(firstList.stream().sorted().collect(Collectors.toList()),
                secondList.stream().sorted().collect(Collectors.toList()));
    }

    private static List<String> mergeTwoSortedList(List<String> firstList, List<String> secondList) {

        int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        int firstArrayLen = firstList.size();
        int secondArrayLen = secondList.size();

        List<String> resList = new ArrayList<>(firstArrayLen + secondArrayLen);

        while (firstArrayIndex < firstArrayLen && secondArrayIndex < secondArrayLen) {
            if (firstList.get(firstArrayIndex).compareTo(secondList.get(secondArrayIndex)) <= 0) {
                resList.add(firstList.get(firstArrayIndex++));
            } else {
                resList.add(secondList.get(secondArrayIndex++));
            }
        }
        while (firstArrayIndex < firstArrayLen) {
            resList.add(firstList.get(firstArrayIndex++));
        }

        while (secondArrayIndex < secondArrayLen) {
            resList.add(secondList.get(secondArrayIndex++));
        }
        return resList;
    }
}
