
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>(Arrays.asList("g","c", "a", "b", "d", "f"));
        Collections.sort(list);
        System.out.println(list);



        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).compareTo(list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            String temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }


      System.out.println(list);


       // sort logika

//        for(String letter : list) {
//
//        }
        // output:
        //  a
        //  b
        //  c
        //  d
        //  f
        //  g
    }
}
