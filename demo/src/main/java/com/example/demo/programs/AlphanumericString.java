package com.example.demo.programs;

public class AlphanumericString {


    public static int findSumOfDigitsFromAlphaNumeric(String s)
    {

        int len=s.length();
        int result = 0;
        for(int i=0;i<len; i++){
            char c=s.charAt(i);
            if(48 <= c && c <= 57){
                result += c-48;
            }

        }

        return result;
    }

}
