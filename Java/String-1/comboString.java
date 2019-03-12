/**
 * Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).

comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
@author unobatbayar
 */

public String comboString(String a, String b) {
    boolean a_longer = a.length() > b.length();
    boolean b_longer = b.length() > a.length();
    
    if(a_longer) return b + a + b;
    return a + b + a;
  }
  