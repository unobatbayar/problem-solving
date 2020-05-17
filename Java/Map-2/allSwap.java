/**

We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a map, this can be solved making just one pass over the array. More difficult than it looks.


allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]

@author unobatbayar
**/

public String[] allSwap(String[] strings) {
  Map<Character, Integer> alphabet = new HashMap<Character, Integer>();
  HashSet<Character> swapped = new HashSet<Character>();
  
  for(int i = 0; i<strings.length; i++){
    if(alphabet.containsKey(strings[i].charAt(0))){
      String temp = strings[i];
      strings[i] = strings[alphabet.get(strings[i].charAt(0))];
      strings[alphabet.get(strings[i].charAt(0))] = temp;
      alphabet.remove(strings[i].charAt(0));
    }
    else alphabet.put(strings[i].charAt(0), i);
  }
  
  return strings;
}
