/**
 Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.


closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true

@author unobatbayar

 */


class closeFar{
    public boolean closeFar(int a, int b, int c) {
        int diff_ab = Math.abs(a - b);
        int diff_bc = Math.abs(b - c);
        int diff_ac = Math.abs(a - c);
        if ((diff_ab) <= 1 && (diff_bc >= 2) && (diff_ac >= 2)){
          return true;
        }
        else if ((diff_bc) <= 1 && (diff_ab >= 2) && (diff_ac >= 2)){
          return true;
        }
        else if((diff_ac) <= 1 && (diff_ab >= 2) && (diff_bc >= 2)){
         return true; 
        }
        return false;
      
      }
}
  