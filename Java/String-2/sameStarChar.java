/*
Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
@author unobatbayar
*/

public boolean sameStarChar(String str) {
    for(int i = 1; i<str.length()-1; i++){
      if(str.charAt(i) == '*'){
        if(str.charAt(i-1) != str.charAt(i+1)) return false;
      }
    }
    return true;
  }
  