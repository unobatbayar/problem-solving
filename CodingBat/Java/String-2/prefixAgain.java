/**Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
@author unobatbayar
*/

public boolean prefixAgain(String str, int n) {
    if(str.length()>1){
      int count = 0;
      for(int i = 0; i < str.length(); i++){
        if(str.substring(i, i+1).equals(str.substring(n-1, n))){
          count++;
        }
      }
      if(count > 1){
        return true;
      } 
    }
    return false;
  }
  