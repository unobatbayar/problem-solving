/**
 * Available at: https://www.hackerrank.com/challenges/fizzbuzz/problem?isFullScreen=true 
 * @author unobatbayar
**/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        for(int i = 1; i<=100; i++){
            String output = "";
            if(i%3 == 0) output = "Fizz";
            if(i%5 == 0) output += "Buzz";
            print(output != "" ? output : i + "");
        }

    }
    
    private static void print(String input){
        System.out.println(input);
    }
}
