package util;

public class Util {
     public static final int BAD_INPUT = -1000000000;

     public static int parseInt(String number) {
         try {
             return Integer.parseInt(number);
         } catch (NumberFormatException e) {
             //System.out.println(e.getMessage());
             return Util.BAD_INPUT;
         }


     }


     public static String[]  glumiceUtil(String number){
         String[] actors = number.split(",");
         int i = 0;
         while (i < actors.length ){
             try {
                 System.out.println(actors[i]);
                 i++;
             }catch (Exception e){
                 System.out.println(e.getMessage());

             }

         }



         return null;
     }
}

