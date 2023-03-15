package util;

public class Util {
     public static final int BAD_INPUT = -1000000000;

     public static int parseInt(String number) {
         try {
             return Integer.parseInt(number);
         } catch(NumberFormatException e) {
             System.out.println(e.getMessage());
             return Util.BAD_INPUT;
         }
     }
}
