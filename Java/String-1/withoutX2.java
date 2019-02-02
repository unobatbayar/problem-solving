/**
 
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"

 */

public String withoutX2(String str) {
    if (str.length()<2){
      return "";
    }
    String start = str.substring(0, 2);
    String end = str.substring(2, str.length());
  
    start = start.replace("x", "");
    return start + end;
  }
  