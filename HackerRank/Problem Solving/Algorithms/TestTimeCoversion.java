/*
Available at: https://www.hackerrank.com/challenges/time-conversion
@author unobatbayar
*/

class test{
    public static void main(String[] args) {
        System.out.println(timeConversion("06:40:03AM"));
    }
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
         
         String hh = s.substring(0, 2);
         String AM_PM = s.substring(s.length()-2, s.length());
         System.out.println(hh);
         System.out.println(AM_PM);

         if(AM_PM.equals("AM")){
            if(hh.equals("12")) hh = "00";
         } 
         else{
            if(!(hh.equals("12"))){
                int change = Integer.parseInt(hh) + 12;
                hh = String.valueOf(change);
            } 
         }
         return hh + s.substring(2, s.length()-2);

    }
}