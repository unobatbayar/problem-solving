import java.util.*;
/**
 
Given a string, return recursively a "cleaned" string where adjacent chars that are the same 
have been reduced to a single char. So "yyzzza" yields "yza".


stringClean("yyzzza") → "yza"
stringClean("abbbcdd") → "abcd"
stringClean("Hello") → "Helo"

@author unobatbayar
 */

 class stringClean{
    public String stringClean(String str) {
        if(str.length() <= 1){
          return str;
        }
        if(str.substring(0, 1).equals(str.substring(1, 2))){
          return stringClean(str.substring(1, str.length()));
        }
        else{
          return str.substring(0, 1) + stringClean(str.substring(1, str.length()));
        }
      }
      
 }
