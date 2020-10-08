/*
Available at: https://www.hackerrank.com/domains/java?badge_type=java&filters%5Bstatus%5D%5B%5D=solved
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
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N%2 != 0 || (N >= 6 && N <= 20)) print("Weird");
        else{
            if((N >= 2 && N <= 5) || (N > 20)) print("Not Weird");
        }

        scanner.close();
    }

    public static void print(String message){
        System.out.println(message);
    }
}

