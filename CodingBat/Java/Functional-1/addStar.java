/*

Given a list of strings, return a list where each string has "*" added at its end.

addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
addStar(["hello", "there"]) → ["hello*", "there*"]
addStar(["*"]) → ["**"]

@author unobatbayar
*/

public List<String> addStar(List<String> strings) {
    strings.replaceAll(s -> (s + "*"));
    return strings;
  }
  