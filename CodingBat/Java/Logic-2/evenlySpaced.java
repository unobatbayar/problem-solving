/**
 * Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
@author unobatbayar
 */

public boolean evenlySpaced(int a, int b, int c) {
    if(a == b && b == c) return true;
    if(a == b || b == c || c==a) return false;
    int small = Math.abs(a-b);
    int medium = Math.abs(b-c);
    int large = Math.abs(a-c);
    
    if(small == medium || small == large || medium == large) return true;
    return false;
  }
  