/**
 * 
Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.


minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"

@author unobatbayar
 */

public String minCat(String a, String b) {
    if(a.length() != b.length()){
      if(a.length() > b.length()){
        int length = a.length() - b.length();
        return a.substring(length, a.length()) + b;
      }else{
        int length = b.length() - a.length();
        return a + b.substring(length, b.length());
      }
    }else{
      return a + b;
    }
  }
  