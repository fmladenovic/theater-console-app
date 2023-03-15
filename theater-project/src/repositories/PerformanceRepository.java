package repositories;

import domain.Performance;
import domain.PerformanceType;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class PerformanceRepository extends Repository<Performance> {



    // pogledaj kako se pise i cita iz file
    // pogledaj kako treba da izgleda path


    public PerformanceRepository() {}
    public PerformanceRepository(String path) {
        this.path = path;
    }




    @Override
    public void parser() {
        // Od stringa pravi objekat

        // ucitaj file sa putanje 'this.path'
        // prodji kroz svaku liniju u tom fileu
        // napravi 'zivi' objekat
        // taj objekat sacuvaj u this.data kao par id -> entitet

        File read = new File(this.path);
        try {
            Scanner scanner = new Scanner(read);
            while (scanner.hasNextLine()) {
                String stringPerformanceRepresentation = scanner.nextLine();
                String[] parts = stringPerformanceRepresentation.split(this.filedDelimiter);

                int id;
                String title = parts[1];
                System.out.println("Pedstava " + title);
                PerformanceType type = PerformanceType.fromStringToPerformanceType(parts[2]) ;
                System.out.println("TIP " + type);
//Trebace mi da nadjem kako da kastujem string u intidzer

                String director = parts[3];
                System.out.println( "Reziser "+director);

                //ArrayList<String> actors = parts[4];// ovde nam izbacuje gresku za string
                //System.out.println(actors);

                int duration = Integer.parseInt(parts[5]);
                System.out.println(duration);

                String production = parts[6];
                System.out.println(production);

                int yearOfProduction = Integer.parseInt(parts[7]);
                System.out.println(yearOfProduction);

                String description = parts[8];
                System.out.println(description);



            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + read);
        }



    }


    @Override
    public void serializer() {
        // Od objekta pravi string sa odredjenim formatom

        // za svaki value u this.data kreiraj neki format koji ce da bude string
        // sve te string formate sacuvaj u file na putanji path
        // primer formata:
        // 1|Na lepom plavom Dunavu|BALLET|Nikola Pavlovic|Neka kurva1,Neka kurva2,Neka kurva3|120|SD Production|2023|Bolje da ne znate|false

        File write = new File("C:\\Users\\ASUS\\Desktop\\teatar1\\theater-console-app\\theater-project\\src\\readWrite\\write.txt");



    }



}
