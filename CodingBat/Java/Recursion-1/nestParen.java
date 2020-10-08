/*
Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))". Suggestion: check the first and last chars, and then recur on what's inside them.

nestParen("(())") → true
nestParen("((()))") → true
nestParen("(((x))") → false
@author unobatbayar

note: code ran through compile problems when used "(" such that incomparable types: char and java.lang.String line:3
I wasn't sure until using '' instead solved the issue. Weird, will look into later.
*/
public boolean nestParen(String str) {
    if(str.equals("")) return true;
    if(str.charAt(0) == '(' && str.charAt(str.length()-1) == ')'){
      return nestParen(str.substring(1, str.length()-1));
    }
    return false;
  }
  