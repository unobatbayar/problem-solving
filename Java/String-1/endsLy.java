/*
Given a string, return true if it ends in "ly".
endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
*/

public boolean endsLy(String str) {
    if(str.length()<2){
      return false;
    }
    if(str.substring(str.length()-2, str.length()).equals("ly")){
      return true;
    }else{
      return false;
    }
  }
  