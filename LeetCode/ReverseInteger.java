/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321

Example 2:

Input: -123
Output: -321

Example 3:

Input: 120
Output: 21

Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

@author unobatbayar
Time and space complexity can still be improved with a better solution or approach
*/
class Solution {
    public int reverse(int x) {
        
        String reversed_str = "";
        int reversed_int = 0;
        boolean negative = false;
        
        //number is negative
        if(x < 0) {
            negative = true;
            x = Math.abs(x);
        }
        
        //reverse 
        while(x != 0){
            reversed_str += String.valueOf(x%10);
            x = x/10;
        }
        
        try{
            reversed_int = Integer.parseInt(reversed_str);    
        }
        catch(Exception e){
            System.out.println("Integer overflow");
        }
        
        if(negative) return -reversed_int;
        return reversed_int;
    }
}