/*Available at: https://www.hackerrank.com/challenges/the-time-in-words/problem 
@author unobatbayar */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {

        String[] words = new String[31];
        words[1] = "one";
        words[2] = "two";
        words[3] = "three";
        words[4] = "four";
        words[5] = "five";
        words[6] = "six";
        words[7] = "seven";
        words[8] = "eigth";
        words[9] = "nine";
        words[10] = "ten";
        words[11] = "eleven";
        words[12] = "twelve";
        words[13] = "thirteen";
        words[14] = "fourteen";
        words[15] = "quarter";
        words[20] = "twenty";
        words[30] = "half";

        // when minute is 00
        if(m < 1) return words[h] + " o' clock";

        // when minutes <= 30
        if((m > 0) && (m <= 30)){
            if(words.length > m && words[m] != null){
                String minute = "";
                if(m == 1) minute = " minute past ";
                else if(m == 15 || m == 30) minute = " past ";
                else minute = " minutes past ";
                return words[m] + minute + words[h];
            }
            return words[(m/10) * 10] + " " + words[m%10] + " minutes past " + words[h]; 
        }
        // when minutes > 30
        int diff = 60 - m;
        if(words.length > diff && words[diff] != null){
            String minute = "";
            if(diff == 1) minute = " minute to ";
            else if(diff == 15 || diff == 30) minute = " to ";
            else minute = " minutes to ";
            return words[diff] + minute + words[h+1];
        }
        return words[(diff/10) * 10] + " " + words[diff%10] + " minutes to " + words[h+1]; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
