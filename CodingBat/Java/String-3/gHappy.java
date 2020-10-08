/**

We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.

gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false

@author unobatbayar

**/

public boolean gHappy(String s) {
  for(int i = 0; i<s.length() ; i++){
    if(s.charAt(i) == 'g') if (!((i != 0 && s.charAt(i - 1) == 'g') || (i < s.length() - 1 && s.charAt(i + 1) == 'g'))) return false;
  }
  
  return true;
 
}
