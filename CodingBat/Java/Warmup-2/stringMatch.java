public int stringMatch(String a, String b) {
    int counter = 0;
    int len = Math.min(a.length(), b.length());
    for(int i = 0; i<=len-2; i++){
      if(a.substring(i, i+2).equals((b.substring(i, i+2)))){
        counter++;
      }  
    }
    return counter;
  }
  