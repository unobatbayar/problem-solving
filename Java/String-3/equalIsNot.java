/*
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).

equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true

@author unobatbayar
*/

public boolean equalIsNot(String str) {
  
    int without_is = (str.length() - str.replace("is", "").length())/2;
    int without_not = (str.length() - str.replace("not", "").length())/3;
  
    return (without_is == without_not);  
  }
  

/*
TEST CODE 

class equalIsNot{
    public static void main (String[] args){
        System.out.println(test("isnotno7Not"));
    }

    public static boolean test(String str) {
  
        int without_is = (str.length() - str.replace("is", "").length())/2;

        System.out.println("NOT LENGTH: " + str.length() + "TEST STRING: " + str);
        System.out.println("IS REMOVED: " + str.replace("is", "").length() + " IS LENGTH: " + (str.length() - str.replace("is", "").length()) + " IS COUNT: " + without_is);
        int without_not = (str.length() - str.replace("not", "").length())/3;
        System.out.println("NOT REMOVED: " + str.replace("not", "").length() + " NOT LENGTH: " + (str.length() - str.replace("not", "").length()) + " NOT COUNT: " + without_not);

      
        return (without_is == without_not);  
      }
      
}
*/