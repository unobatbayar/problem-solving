/*
Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.

linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true

@author unobatbayar
*/

public boolean linearIn(int[] outer, int[] inner) {
  
  if(inner.length <= 0) return true;
  
  int count = 0;
  
  for(int i = 0; i<outer.length; i++){

    if(outer[i] == inner[count]){
      count++;
    } 
    else if (outer[i] > inner[count]){
      return false;
    }
    if(count == inner.length) return true;
  }
  
  return false;
  
}
