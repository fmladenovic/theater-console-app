package repositories;

import domain.Performance;

public class PerformanceRepository extends Repository<Performance> {

    // pogledaj kako se pise i cita iz file
    // pogledaj kako treba da izgleda path

    @Override
    public void parser() {
        // Od stringa pravi objekat

        // ucitaj file sa putanje 'this.path'
        // prodji kroz svaku liniju u tom fileu
        // napravi 'zivi' objekat
        // taj objekat sacuvaj u this.data kao par id -> entitet
    }

    @Override
    public void serializer() {
        // Od objekta pravi string sa odredjenim formatom

        // za svaki value u this.data kreiraj neki format koji ce da bude string
        // sve te string formate sacuvaj u file na putanji path
        // primer formata:
        // 1|Na lepom plavom Dunavu|BALLET|Nikola Pavlovic|Neka kurva1,Neka kurva2,Neka kurva3|120|SD Production|2023|Bolje da ne znate|false
    }

    public PerformanceRepository() {}
    public PerformanceRepository(String path) {
        this.path = path;
    }
}
