/* Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

powerN(3, 1) → 3
powerN(3, 2) → 9
powerN(3, 3) → 27
@author unobatbayar
*/
public int powerN(int base, int n) {
    if(n == 1) return base;
    return base * powerN(base, n-1);
  }
  