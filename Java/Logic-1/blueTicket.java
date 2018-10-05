import java.util.*;

/**
 
You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac.
 Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. 
 Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.


blueTicket(9, 1, 0) → 10
blueTicket(9, 2, 0) → 0
blueTicket(6, 1, 4) → 10

 */

class blueTicket{
    public int blueTicket(int a, int b, int c) {
        int diff1 = (a+b) - (b+c);
        int diff2 = (a+b) - (a+c);
        int result;
        
        if (a+b == 10 || b+c == 10 || a+c == 10)
        {
          result = 10;
        }
        else if (diff1 == 10 || diff2 == 10)
        {
          result = 5;
        }
        else
        {
          result = 0;
        }
        return result;
    }
      
}