/*

Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
*/

class stringE{
    public boolean stringE(String str) {
        int counter = 0;
        
        for(int i = 0; i<str.length(); i++){
          if (str.substring(i, i+1).equals("e")){
            counter += 1;
          }
        }
        return (counter == 1 || counter == 3);
      }

}
  