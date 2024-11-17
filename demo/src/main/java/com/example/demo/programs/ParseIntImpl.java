package com.example.demo.programs;

public class ParseIntImpl {

    public static Integer parseInt(String s) throws NumberFormatException {
        int i=0;
        int len=s.length();
        int result = 0;
        boolean negative = false;
        int limit=Integer.MAX_VALUE;
        if (len == 0) {
            throw new NumberFormatException(s);
        }
        char firstChar = s.charAt(0);
        if (firstChar == '-') {
            negative=true;
            i++;
        } else if(firstChar == '+') {
            i++;
        }
        while (i < len) {
            char c = s.charAt(i++);
            if (48 <= c && c <=57) {
              if ((result*10) + (c - 48) > limit) {
                  throw new NumberFormatException(s);
              }
              result =(result*10) + (c - 48);
            } else {
                throw new NumberFormatException(s);
            }
        }
        return negative ? -result: result;

    }
}
