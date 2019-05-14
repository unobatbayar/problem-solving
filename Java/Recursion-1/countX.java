/*
Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
@author unobatbayar
*/

public int countX(String str) {
    if(str.length() < 1) return 0;
    if(str.charAt(0) == 'x') return 1 + countX(str.substring(1));
    return countX(str.substring(1));
  }
  