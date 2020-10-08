/*
Available at: https://www.hackerrank.com/challenges/plus-minus/problem 
@author unobatbayar
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int n = arr.length;
        double positives = 0;
        double negatives = 0;
        double zeros = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > 0) positives++;
            if(arr[i] < 0) negatives++;
            if(arr[i] == 0) zeros++;
        }

        System.out.println(String.format("%.5f", positives/n));
        System.out.println(String.format("%.5f", negatives/n));
        System.out.println(String.format("%.5f", zeros/n));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
