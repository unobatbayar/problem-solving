import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
    
         String hh = s.substring(0, 2);
         String AM_PM = s.substring(s.length()-2, s.length());

         if(AM_PM.equals("AM")){
            if(hh.equals("12")) hh = "00";
         } 
         else{
            if(!(hh.equals("12"))){
                int change = Integer.parseInt(hh) + 12;
                hh = String.valueOf(change);
            } 
         }
         return hh + s.substring(2, s.length()-2);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
