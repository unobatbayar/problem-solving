/*
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18

@author unobatbayar

Bug found, working solution!
*/

public int sumNumbers(String str) {
    String numbers = "";
    boolean previousIsNumber = false;
    int result = 0;
    
    for(int i = 0; i<str.length(); i++){
      if(Character.isDigit(str.charAt(i))){
        if(previousIsNumber){
          numbers += str.charAt(i) + "";
        }else{
          numbers += " " + str.charAt(i);
        }
        previousIsNumber = true;
      } 
      else{
        previousIsNumber = false;
      }
    }
    String[] numbers_splitted = numbers.split("\\s+");
    
    //We have to skip 0 since the first number found inserts a space.
    for(int i = 1; i<numbers_splitted.length; i++){
      int temp = Integer.valueOf(numbers_splitted[i]);
      result += temp;
    }
    
    return result;
  }
  