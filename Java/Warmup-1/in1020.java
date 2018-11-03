/*

Given 2 int values, return true if either of them is in the range 10..20 inclusive.


in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
*/

class in1020{
    public boolean in1020(int a, int b) {
        int z = Math.min(a, b);
        return (z >= 10 && z <= 20);
      }      
}