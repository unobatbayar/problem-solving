/* 
nna and Brian are sharing a meal at a restuarant and they agree to split the bill equally. Brian wants to order something that Anna is allergic to though, and they agree that Anna won't pay for that item. Brian gets the check and calculates Anna's portion. You must determine if his calculation is correct.

For example, assume the bill has the following prices:
. Anna declines to eat item which costs . If Brian calculates the bill correctly, Anna will pay . If he includes the cost of , he will calculate . In the second case, he should refund

to Anna.

Function Description

Complete the bonAppetit function in the editor below. It should print Bon Appetit if the bill is fairly split. Otherwise, it should print the integer amount of money that Brian owes Anna.

bonAppetit has the following parameter(s):

    bill: an array of integers representing the cost of each item ordered
    k: an integer representing the zero-based index of the item Anna doesn't eat
    b: the amount of money that Anna contributed to the bill

Input Format

The first line contains two space-separated integers
and , the number of items ordered and the -based index of the item that Anna did not eat.
The second line contains space-separated integers where .
The third line contains an integer,

, the amount of money that Brian charged Anna for her share of the bill.

Constraints

    The amount of money due Anna will always be an integer

Output Format

If Brian did not overcharge Anna, print Bon Appetit on a new line; otherwise, print the difference (i.e.,

) that Brian must refund to Anna. This will always be an integer.

Sample Input 0

4 1
3 10 2 9
12

Sample Output 0

5

Explanation 0
Anna didn't eat item
, but she shared the rest of the items with Brian. The total cost of the shared items is and, split in half, the cost per person is . Brian charged her for her portion of the bill. We print the amount Anna was overcharged,

, on a new line.

Sample Input 1

4 1
3 10 2 9
7

Sample Output 1

Bon Appetit

Explanation 1
Anna didn't eat item
, but she shared the rest of the items with Brian. The total cost of the shared items is and, split in half, the cost per person is . Because , we print Bon Appetit on a new line. 

Available at: https://www.hackerrank.com/challenges/bon-appetit/problem
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

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int actual_price = 0;
        for(int i = 0; i<bill.size(); i++){
            if(i == k) continue;
            else actual_price += bill.get(i);
        }
        if(actual_price/2 == b) System.out.println("Bon Appetit");
        else System.out.println(b - actual_price/2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
