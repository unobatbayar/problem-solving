/* 
Available at: https://www.hackerrank.com/challenges/caesar-cipher-1/problem
@author unobatbayar

THIS IS MY FIRST APPROACH TO THE PROBLEM. HOWEVER, WORKS BUT NOT CORRECT
SINCE I MUST USE ASCII TABLE FOR CONVERSION.
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
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String shifted = "";
        
        for(int i = 0; i<s.length(); i++){
          int caesar = 0;
          boolean letter = false;
          
          for(int j = 0; j<alphabet.length; j++){
              if(s.charAt(i) == alphabet[j]){
                  caesar = j+k;
                  letter = true;
                  if(caesar > 25) caesar -= 26;
              }
          }
          if(letter){
            shifted += String.valueOf(alphabet[caesar]);
          }else{
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
