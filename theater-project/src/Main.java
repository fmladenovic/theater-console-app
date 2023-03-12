import domain.Performance;
import domain.PerformanceType;
import domain.Seat;
import repositories.PerformanceRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Test serializer
        PerformanceRepository testSerializerPerformanceRepository = new PerformanceRepository("neki-path-do-filea");

        Map<Integer, Performance> data = new HashMap<Integer, Performance>();
        ArrayList<String> glumice = new ArrayList<String>();
        glumice.add("Neka kurva1");
        glumice.add("Neka kurva2");
        glumice.add("Neka kurva3");
        data.put(
                1,
                new Performance(
                        1,
                        "Na lepom plavom Dunavu",
                        PerformanceType.BALLET,
                        "Nikola Pavlovic",
                        glumice,
                        120,
                        "SD Production",
                        2023,
                        "Bolje da ne znate",
                        false
                        )
        );
        testSerializerPerformanceRepository.setData(data);
        testSerializerPerformanceRepository.serializer();
        // rezultat:
        // U dokumentu na prosledjenom pathu treba da bude serializovan ovaj objekat u ovom formatu
        // 1|Na lepom plavom Dunavu|BALLET|Nikola Pavlovic|Neka kurva1,Neka kurva2,Neka kurva3|120|SD Production|2023|Bolje da ne znate|false


        // Test serializer
        PerformanceRepository testParserPerformanceRepository = new PerformanceRepository("neki-drugi-path-do-filea");
        // Napravi dokument sa ovakvim zapisima:
        // 1|Na lepom plavom Dunavu|BALLET|Nikola Pavlovic|Neka kurva1,Neka kurva2,Neka kurva3|120|SD Production|2023|Bolje da ne znate|false
        // prosledi putanju umesto 'neki-drugi-path-do-filea'


        // rezultat:
        // treba da pogledas da li se u testParserPerformanceRepository.getData() nalazi novi objekat
    }
}