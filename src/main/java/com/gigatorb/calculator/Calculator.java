package com.gigatorb.calculator;
import java.io.*;

public class Calculator {
    public int add(String s){
        int sum=0;
        if(s.length() == 0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        String[] arr = s.split(",|\\;|\\\n");
        int[] num = null;
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        return sum;
    };

}



