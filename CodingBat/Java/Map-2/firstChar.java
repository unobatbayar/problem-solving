/*
 * 
 * Given an array of non-empty strings, return a Map<String, String> with a key
 * for every different first character seen, with the value of all the strings
 * starting with that character appended together in the order they appear in
 * the array.
 * 
 * firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t":
 * "teatoast"} firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA",
 * "b": "bb", "c": "cccCC", "d": "d"} firstChar([]) → {}
 * 
 * @author unobatbayar
 */

public Map<String, String> firstChar(String[] strings) {
    Map<String, String> map = new HashMap<String, String>();
    
    for(int i = 0; i<strings.length; i++){
      String first = strings[i].substring(0, 1);
      if(map.containsKey(first)){
        map.put(first, map.get(first) + strings[i]);
      }
      else{
        map.put(first, strings[i]);
      }
    }
    
    return map;
  
  }
