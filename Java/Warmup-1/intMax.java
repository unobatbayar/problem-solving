/***
 
Given three int values, a b c, return the largest.


intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3 
 
@author unobatbayar 
***/

class intMax{
    public int intMax(int a, int b, int c) {
  
        if (a > b && b > c)
        {
          return a;
        }
        else if (a < b && b > c)
        {
          return b;
        }
        else if (c > b && c > a)
        {
          return c;
        }
        else if ( c > b && a > c)
        {
          return a;
        }
        else
        {
          return a;
        }
    }

}