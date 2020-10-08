/*

Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.

pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

@author unobatbayar
*/

public Map<String, String> pairs(String[] strings) {
  
    Map<String, String> map = new HashMap<String, String>();
    
    for(int i = 0; i<strings.length; i++){
      char first = strings[i].charAt(0);
      char last = strings[i].charAt(strings[i].length()-1);
      map.put(first + "", last + "");
    }
    
    return map;
  }
  