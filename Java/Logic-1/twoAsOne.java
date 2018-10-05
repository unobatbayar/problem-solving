import java.util.*;
/**
 Given three ints, a b c, return true if it is possible to add two of the ints to get the third.


twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false

@author unobatbayar
 */

 class twoAsOne{
    public boolean twoAsOne(int a, int b, int c) {
        int sumab = a + b;
        int sumac = a + c;
        int sumbc = b + c;
        
        if(sumab == c){
          return true;
        }
        else if(sumac == b){
          return true;
        }
        else if(sumbc == a){
          return true;
        }
       else{
        return false;
      }
      }      

 }