/**
 * Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true
@author unobatbayar
 */

public boolean lessBy10(int a, int b, int c) {
    int ab = Math.abs(a-b);
    int bc = Math.abs(b-c);
    int ac = Math.abs(a-c);
    
    if(ab >= 10 || bc >= 10 || ac >= 10){
      return true;
    }
    return false;
    
  }
  