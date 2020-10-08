class sumNumbersTest{
    public static void main (String[] args){
        //System.out.println(sumNumbers("aa11b33"));
        sumNumbers("aa11b33");
    }

    public static void sumNumbers(String str) {
        String numbers = "";
        boolean previousIsNumber = false;
        int result = 0;
        
        for(int i = 0; i<str.length(); i++){
          if(Character.isDigit(str.charAt(i))){
            if(previousIsNumber){
              numbers += str.charAt(i) + "";
            }else{
              numbers += " " + str.charAt(i);
            }
            previousIsNumber = true;
          } 
          else{
            previousIsNumber = false;
          }
        }
        String[] numbers_splitted = numbers.split("\\s+");
        for(int i = 0; i<numbers_splitted.length; i++){
          //result += Integer.valueOf(numbers_splitted[i]);
          System.out.println("Length " + i + ":" + numbers_splitted[i]);
        }
        
        //return result;
      }
}