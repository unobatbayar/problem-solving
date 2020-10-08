/**

Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"

@author unobatbayar
**/

public String mixString(String a, String b) {
    int length = Math.max(a.length(), b.length());
    String result = "";

    for (int i = 0; i < length; i++) {
        if (a.equals("")) {
            result += b;
            break;
        }
        if (b.equals("")) {
            result += a;
            break;
        }
        
        result += a.substring(0, 1);
        a = a.substring(1);
        
        result += b.substring(0, 1);
        b = b.substring(1);
    }

    return result;
}
