/** 

Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.


wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
Go...Save, Compile, Ru

@author unobatbayar
**/

public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> multiple = new HashMap<>();
  
  for(int i = 0; i<strings.length; i++){
    if(multiple.containsKey(strings[i])) multiple.put(strings[i], true);
    else multiple.put(strings[i], false);
  }
  
  return multiple;
}

