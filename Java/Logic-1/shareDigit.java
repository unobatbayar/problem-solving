/**
 * Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)

shareDigit(12, 23) → true
shareDigit(12, 43) → false
shareDigit(12, 44) → false
@author unobatbayar
 */

public boolean shareDigit(int a, int b) {
    boolean aa = a/10 == b/10;
    boolean bb = a%10 == b%10;
    boolean ab = a/10 == b%10;
    boolean ba = a%10 == b/10;
    
    if(aa || bb || ab || ba) return true;
    return false;
    
  }
  