/**
 * Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)

fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
@author unobatbayar
 */
public String fizzString(String str) {
    String output = "";
    boolean fb = false;
    if(str.startsWith("f")){
      output = "Fizz";
      fb = true;
    }
    if(str.endsWith("b")){
      output = output + "Buzz";
      fb = true;
    }
    if(!(fb)){
      return str;
    }
    return output;
  }
  