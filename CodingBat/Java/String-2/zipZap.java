/*

Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"

@author unobatbayar
*/

public String zipZap(String str) {
    if(str.length() < 3) return str;
    
    String removed = "";
    for(int i = 0; i <str.length(); i++){
      if(str.substring(i, i+1).equals("z") && str.substring(i+2, i+3).equals("p")){
        removed += "zp";
        i+=2;
      }
      else{
        removed += str.charAt(i) + "";
      }
    }
    
    return removed;
    
  }
  