/*
Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from to

for three categories: problem clarity, originality, and difficulty.

We define the rating for Alice's challenge to be the triplet
, and the rating for Bob's challenge to be the triplet

.

Your task is to find their comparison points by comparing
with , with , and with

.

    If 

, then Alice is awarded
point.
If
, then Bob is awarded
point.
If

    , then neither person receives a point.

Comparison points is the total points a person earned.

Given
and

, determine their respective comparison points.

For example,
and . For elements , Bob is awarded a point because . For the equal elements and , no points are earned. Finally, for elements , so Alice receives a point. Your return array would be

with Alice's score first and Bob's second.

Function Description

Complete the function compareTriplets in the editor below. It must return an array of two integers, the first being Alice's score and the second being Bob's.

compareTriplets has the following parameter(s):

    a: an array of integers representing Alice's challenge rating
    b: an array of integers representing Bob's challenge rating

Input Format

The first line contains
space-separated integers, , , and , describing the respective values in triplet .
The second line contains space-separated integers, , , and , describing the respective values in triplet

.

Constraints

Output Format

Return an array of two integers denoting the respective comparison points earned by Alice and Bob.

Sample Input 0

5 6 7
3 6 10

Sample Output 0

1 1

Explanation 0

In this example:

Now, let's compare each individual score:

, so Alice receives
point.
, so nobody receives a point.
, so Bob receives

    point.

Alice's comparison score is
, and Bob's comparison score is . Thus, we return the array

.

Sample Input 1

17 28 30
99 16 8

Sample Output 1

2 1

Explanation 1

Comparing the
elements, so Bob receives a point.
Comparing the and elements, and so Alice receives two points.
The return array is . 

Available at: https://www.hackerrank.com/challenges/compare-the-triplets/problem
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

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> comparison = new ArrayList();
        int alice = 0;
        int bob = 0;

        for(int i = 0; i<a.size(); i++){
            if(a.get(i) > b.get(i)) alice++;
            if(a.get(i) < b.get(i)) bob++;
        }

        comparison.add(alice);
        comparison.add(bob);
        return comparison;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

