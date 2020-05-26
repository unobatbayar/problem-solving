/**

Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".


sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"

@author unobatbayar
**/

public String sameEnds(String str) {
  String longest = "";
  for(int i = 0; i<str.length(); i++){
    if(str.substring(0, i).equals(str.substring(str.length() - i, str.length()))){
      if(str.substring(0, i).length() - 1 < str.length()/2)longest = str.substring(0, i);
    } 
  }
  
  return longest;
}
