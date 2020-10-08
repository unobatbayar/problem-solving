/**
 * Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
@author unobatbayar
 */

public String nonStart(String a, String b) {
    String ac = a.substring(1, a.length());
    String bc = b.substring(1, b.length());
    return ac + bc;
  }
  