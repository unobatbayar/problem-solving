public String repeatSeparator(String word, String separator, int count) {
  //solution by Aniket Sahrawat
  //return String.join(separator, Collections.nCopies(count, word));
  
  //my solution
  if(count == 0) return "";
  String result = word;
  for(int i = 0; i<count-1; i++) result += separator + word;
  
  return result;
}
