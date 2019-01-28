/**
 
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
@author unobatbayar
 */

public String altPairs(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i += 4 ){
      if(str.length() < (i+2)){
        result = result + str.substring(i, str.length());
      }else{
        result = result + str.substring(i, i+2); 
      }
    }
    return result;
  }
  