/**
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.


stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */

public String stringX(String str) {
    // Check first
    if(str.length()<3){
     return str;
    }
    
    String start = str.substring(0, 1);
    String end = str.substring(str.length()-1, str.length());
    String middle = str.replace("x", "");
    String result = "";
    
    if(start.equals("x") && end.equals("x")){
      result = start + middle + end;
    }
    else{
      result = middle;
    }
    
    return result;
  
  }
  