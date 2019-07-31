/*
Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false

@author unobatbayar
*/

public boolean bobThere(String str) {
  
    for(int i = 0; i<str.length(); i++){
      if(str.charAt(i) == 'b' && (i+2 < str.length() && str.charAt(i+2) == 'b')) return true;
    }
    return false;
  }
  