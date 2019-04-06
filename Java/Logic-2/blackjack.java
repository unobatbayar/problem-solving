/*
Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
*/
public int blackjack(int a, int b) {
    int aa = a;
    int bb = b;
    
    if(a > 21) aa = 0;
    if(b > 21) bb = 0; 
    
    if(aa > bb) return aa;
    return bb;
  }
  