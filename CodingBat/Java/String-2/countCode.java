/*
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
@author unobatbayar 
*/

public int countCode(String str) {
    char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    int length = str.length();
    
    for(int i = 0; i<26; i++){
      String temp = "co" + alphabet[i] + "e";
      str = str.replace(temp, "");  
    }
    
    length = length - str.length();    
    return length/4;
  }
  