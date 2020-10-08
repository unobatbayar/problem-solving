/**
 
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true

 */

boolean doubleX(String str) {
    if(str.length()<2) return false;
    
    int first = str.indexOf('x');
    if(first == -1) return false;
    else{
      if(str.length() > (first+1)){
        if(str.charAt(first+1) == ('x')){
        return true; 
      }
    } 
    }
    return false;
  }
  