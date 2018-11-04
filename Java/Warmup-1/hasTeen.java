/*

We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.


hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
*/

class hasTeen{
    public boolean hasTeen(int a, int b, int c) {
        int[] values = {a, b, c};
        for (int i = 0; i < 3; i++){
          if (values[i] >= 13 && values[i] <= 19) return true;
        }
        return false;
    }      
}