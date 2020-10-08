/*

Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.


delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
*/

class delDel{
    public String delDel(String str) {
        if(str.length()>=4 && str.substring(1, 4).equals("del")){
          String first = str.substring(0, 1);
          String last = str.substring(4, str.length());
          return first + last;
        }
        return str;
      }
      
}