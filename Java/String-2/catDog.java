/*

Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true

@author unobatbayar
*/

public boolean catDog(String str) {
  // I reused and translated my Python solution into Java
  Integer count_dog = 0;
  Integer count_cat = 0;
  
  //search cats/dogs and count the number of times
  for (int i = 0; i<str.length()-2; i++){
    if (str.substring(i, i+3).equals("dog")){
     count_dog += 1 ;
    }
    if (str.substring(i, i+3).equals("cat")){
      count_cat += 1  ;
    }
  }    
  //match the number of times    
  if (count_dog == count_cat){
    return true;
  }
  else{
    return false;
  }
}

