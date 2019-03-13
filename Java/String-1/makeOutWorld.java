/**
 * Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
@author unobatbayar
 */

public String makeOutWord(String out, String word) {
    String front = out.substring(0, out.length()/2);
    String end = out.substring(out.length()/2, out.length());
    
    return front + word + end;
  }
  