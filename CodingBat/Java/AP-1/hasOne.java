/*
Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.

hasOne(10) → true
hasOne(22) → false
hasOne(220) → false
@author unobatbayar
*/

public boolean hasOne(int n) {
    if(checkOne(n) == 1) return true;
    return false;
  }
  
  public int checkOne(int n){
    if(n < 1) return 0;
    if(n%10 == 1) return 1;
    return checkOne(n/10);
  }
  