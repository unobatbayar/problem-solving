/* 
Available at: https://www.hackerrank.com/challenges/caesar-cipher-1/problem
@author unobatbayar

Second version, working in all test cases.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        String shifted = "";
        k %= 26;

        for(int i = 0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                int ascii = s.charAt(i);
                if(ascii >= 'A' && ascii <= 'Z') {
                    if((ascii + k) > 'Z') ascii = ascii - 26 + k;
                    else ascii += k;
                }
                else if(ascii >= 'a' && ascii <= 'z'){
                    if((ascii + k) > 'z') ascii = ascii - 26 + k;
                    else ascii += k;
                } 
                shifted += String.valueOf((char)ascii);
            }
            else{
                shifted += String.valueOf(s.charAt(i));
            }
        }
        
        return shifted;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
