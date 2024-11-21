package com.example.demo.programs;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExecutionProgram {

    public static void main(String[] arg) {
        // Leader Array Calling
        System.out.println("Started execution");
        Scanner scanner=new Scanner(System.in);
        /*System.out.println("Please enter length for leaderArray");
        int n=scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter Array values for leaderArray");
        for (int i=0;i<n;i++) {
            arr[i]=scanner.nextInt();
        }
        List<Integer> leaderResult = LeaderFromArray.leaders(arr, n);
        leaderResult.forEach(v -> System.out.print(v+" "));
        System.out.println();

        //Rotate values from the K Position
        System.out.println("Please enter the K position to left rotate the K position");
        int k =scanner.nextInt();
        System.out.println("Please enter array values");
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        RotateKPosition.rotateKPositionToLeft(arr, n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //Parse Int Implementation
        System.out.println("Please enter Numeric String for Integer Parse");
        String strParse=scanner.next();
        int parseResult= ParseIntImpl.parseInt(strParse);
        System.out.println(parseResult);

        //Find sum of digits from AlphaNumeric String
        System.out.println("Please enter Alphanumeric String");
        String s=scanner.next();
        int sumOfDigitResult= AlphanumericString.findSumOfDigitsFromAlphaNumeric(s);
        System.out.println(sumOfDigitResult);*/

        System.out.println("Please enter First Strings of List Len");
        int firstArrLen=scanner.nextInt();
        System.out.println("Please enter Strings for First List");
        List<String> firstList=new ArrayList<>();
        for (int i=0;i<firstArrLen;i++) {
            firstList.add(scanner.next());
        }

        System.out.println("Please enter Second Strings of List Len");
        int secondArrLen=scanner.nextInt();
        System.out.println("Please enter Strings for Second List");
        List<String> secondList=new ArrayList<>();
        for (int i=0;i<secondArrLen;i++) {
            secondList.add(scanner.next());
        }

        List<String> mergeSortResult = SortTwoStringLists.sortTwoStringList(firstList, secondList);
        System.out.println(mergeSortResult);
    }
}
