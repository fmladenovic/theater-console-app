import domain.Performance;
import repositories.GlobalRepository;
import services.PerformanceService;
import util.SortDirection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>(Arrays.asList("g","c", "a", "b", "d", "f"));

       // sort logika

        for(String letter : list) {
            System.out.println(letter);
        }
        // output:
        //  a
        //  b
        //  c
        //  d
        //  f
        //  g
    }
}
