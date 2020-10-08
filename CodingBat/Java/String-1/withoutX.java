/**
 Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"

 */

public String withoutX(String str) {
    if(str.length()<2){
      return "";
    }
    String first = str.substring(0, 1);
    String middle = str.substring(1, str.length()-1);
    String last = str.substring(str.length()-1, str.length());
    first = first.replace("x", "");
    last = last.replace("x", "");
    
    return first + middle + last;
  }
  