package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Util {
     public static final int BAD_INPUT = -1000000000;
     public static int parseInt(String number) {
         try {
             return Integer.parseInt(number);
         } catch (NumberFormatException e) {
             System.out.println(e.getMessage());
             return Util.BAD_INPUT;
         }
     }
     public static ArrayList<String> parseActors(String actorsStr){
         String[] actors = actorsStr.split(",");
         ArrayList<String> stringList = new ArrayList<String>(Arrays.asList(actors));
         return stringList;
     }
     //funkcija koja mi pretvara arraylist u string sa delimiterom(,)

     public static boolean parseBolean(String boleanStr){
         if (boleanStr.equals("false")){
             return false;
         }
         else if (boleanStr.equals("true")){
             return true;
         }
         return false;
     }
}

