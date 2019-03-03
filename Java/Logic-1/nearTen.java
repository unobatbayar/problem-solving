/**
 * Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod

nearTen(12) → true
nearTen(17) → false
nearTen(19) → true
@author unobatbayar
 */

public boolean nearTen(int num) 
{
  int[] checklist = {num%10, (num+1)%10, (num+2)%10};
  
  for(int i = 0; i <3; i++){
    if(0 <= checklist[i] && checklist[i] <3 ){
      return true;
    }
  }
  return false;
}
