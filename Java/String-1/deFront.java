/** 
Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
@author unobatbayar
**/
public String deFront(String str) {    
    Boolean a = str.startsWith("a");
    Boolean b = str.substring(1).startsWith("b");
    
    if(a && !(b)) return "a" + str.substring(2, str.length());
    if(b && !(a)) return "b" + str.substring(2, str.length());
    if(a && b) return str;
    
    return str.substring(2, str.length());
  }

  