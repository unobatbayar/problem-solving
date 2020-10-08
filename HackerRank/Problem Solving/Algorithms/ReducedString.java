/* Available at: https://www.hackerrank.com/challenges/reduced-string/problem?isFullScreen=true
@author unobatbayar
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {

        String reduced, temp;
        reduced = temp = "";
        
        while(s.length() > 0){
            temp = s.replace(String.valueOf(s.charAt(0)), "");
            if((s.length() - temp.length())%2 != 0 ) reduced += s.charAt(0) + "";
            s = temp;
        }

        if(reduced.length() == 0) return "Empty String";
        return reduced;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
