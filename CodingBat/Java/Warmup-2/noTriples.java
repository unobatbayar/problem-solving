/*

Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.


noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
*/

class noTriples{
    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length-2; i++){
          if(nums[i] == nums[i+1] && nums[i+1] == nums[i+2]){
            return false;
          }
        }
        return true;
      }      
}
  