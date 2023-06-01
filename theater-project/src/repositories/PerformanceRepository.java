package repositories;

import domain.Performance;
import domain.PerformanceType;
import util.Util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

                int id = Util.parseInt(parts[0]);
                System.out.println("id " + id);

                String title = parts[1];
                System.out.println("Pedstava " + title);

                PerformanceType type = PerformanceType.fromStringToPerformanceType(parts[2]) ;
                System.out.println("TIP " + type);

                String director = parts[3];
                System.out.println( "Reziser "+director);

                ArrayList<String> actres = Util.parseActors(parts[4]);
                System.out.println("Actres: " + actres);
                
                int duration = Util.parseInt(parts[5]);
                System.out.println( "duration " + duration);

                String production = parts[6];
                System.out.println( "production "+production);

                int yearOfProduction = Util.parseInt(parts[7]);
                System.out.println( "yearOfProduction "+yearOfProduction);

                String description = parts[8];
                System.out.println(description);

                boolean isDelated = Util.parseBolean(parts[9]);
                System.out.println(isDelated);
                //Ovo ce biti onjasnjenje za stash
                Performance performance = new Performance(
                        id,
                        title,
                        type,
                        director,
                        actres,
                        duration,
                        production,
                        yearOfProduction,
                        description,
                        isDelated
                );
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + read);
        }

    }



    @Override
    public void serializer() {
        File write = new File(this.path);
        Performance performance1 = new Performance(
                1,
                "Dzonijeva predtsva",
                PerformanceType.DRAMA,
                "DzoniDebilcina",
                new ArrayList<String>(Arrays.asList("Kurva1", "Kurva2", "Kurva3")),
                360,
                "KototamopevaProdaksn",
                2023,
                "SeksNaSuvo",
                false
        );
            try {
                FileWriter writer = new FileWriter(write);
                writer.write(
                        performance1.getId()+"|"+
                                performance1.getTitle()+"|"+
                                performance1.getType()+ "|"+
                                performance1.getDirector()+ "|"+
                                performance1.getActors()+ "|"+
                                performance1.getDuration()+ "|"+
                                performance1.getProduction()+ "|"+
                                performance1.getYearOfProduction()+ "|"+
                                performance1.getDescription()+ "|"+
                                performance1.isDeleted()
                );

                writer.close();
                System.out.println("File created and written to successfully!");
            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }


        // Od objekta pravi string sa odredjenim formatom

        // za svaki value u this.data kreiraj neki format koji ce da bude string
        // sve te string formate sacuvaj u file na putanji path
        // primer formata:
        // 1|Na lepom plavom Dunavu|BALLET|Nikola Pavlovic|Neka kurva1,Neka kurva2,Neka kurva3|120|SD Production|2023|Bolje da ne znate|false



    }




