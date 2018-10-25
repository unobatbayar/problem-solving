/*

Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2

*/
class countHi{
	public int countHi(String str) {
	Integer counter = 0;
  
	for (int i = 0; i <str.length()-1; i++){
		if (str.substring(i, i + 2).equals("hi")){
        		counter = counter + 1;
        	}
        }
        return counter;
	}	


}
