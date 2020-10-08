/*


Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.


nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false

*/

class nearHundred{
    public boolean nearHundred(int n) {
        int diff = Math.abs(100 - n);
        int diffTwo = Math.abs(200 - n);
        
        if(diff <= 10 || diffTwo <= 10){
          return true;
        }
        return false;
      }
      
}
  