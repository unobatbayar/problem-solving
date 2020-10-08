/*

Given a list of strings, return a list of the strings, omitting any string length 3 or 4.

no34(["a", "bb", "ccc"]) → ["a", "bb"]
no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
no34(["ccc", "dddd", "apple"]) → ["apple"]

@author unobatbayar
*/  

public List<String> no34(List<String> strings) {
    strings.removeIf(s -> s.length() == 3 || s.length() == 4);
    return strings;
  }
  