/*

Given a list of strings, return a list where each string has all its "x" removed.

noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
noX(["x"]) → [""]

@author unobatbayar
*/

public List<String> noX(List<String> strings) {
    strings.replaceAll(s -> s.replace("x", ""));
    return strings;
  }
  