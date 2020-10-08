/**
The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.

love6(6, 4) → true
love6(4, 5) → false
love6(1, 5) → true
@author unobatbayar 
*/

public boolean love6(int a, int b) {
  int sum = a + b;
  int diff = Math.abs(a-b);
  int[] checklist = {a, b, sum, diff};
  
  for(int i = 0; i <4; i++){
    if(checklist[i] == 6){
      return true;
    }
  }
  return false;
}
