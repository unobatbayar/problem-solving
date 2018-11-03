/*

Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.


in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true

*/

class int3050{
    public boolean in3050(int a, int b) {
        if ((30 <= a && a <= 40) && (30 <= b && b <= 40)) {
          return true;
        }
        else if ((40 <= a && a <= 50) && (40 <= b && b <= 50)) {
          return true;
        }
        return false;
    }
    
}

