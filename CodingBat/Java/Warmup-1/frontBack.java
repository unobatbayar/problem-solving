/*

Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
*/

class frontBack{
    public String frontBack(String str) {
        if (str.length()< 2) return str;
        String body = str.substring(1, str.length()-1);
        return str.charAt(str.length()-1) + body + str.charAt(0);
      }      
}