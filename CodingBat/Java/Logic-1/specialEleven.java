/**
We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod

specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false
 */

 public boolean specialEleven(int n) {
  if(0 <= n%11 && n%11 <= 1){
    return true;
  }
  return false;
}
