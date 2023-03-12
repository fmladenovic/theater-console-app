package domain;

import java.util.ArrayList;

public class Performance extends Entity {
    private String title;
    private PerformanceType type;
    private String director;
    private ArrayList<String> actors;
    private int duration;
    private String production;
    private int yearOfProduction;
    private String description;

    public Performance(){}
    public Performance(
            int id,
            String title,
            PerformanceType type,
            String director,
            ArrayList<String> actors,
            int duration,
            String production,
            int yearOfProduction,
            String description,
            boolean isDeleted
    ) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.director = director;
        this.actors = actors;
        this.duration = duration;
        this.production = production;
        this.yearOfProduction = yearOfProduction;
        this.description = description;
        this.isDeleted = isDeleted;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public PerformanceType getType() {
        return type;
    }
    public void setType(PerformanceType type) {
        this.type = type;
    }

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getActors() {
        return actors;
    }
    public void setActors(ArrayList<String> actors) {
        this.actors = actors;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getProduction() {
        return production;
    }
    public void setProduction(String production) {
        this.production = production;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String serialize() {
        // todo
        return "format";
    }

    @Override
    public void parse(String objectRepresentation) {
        // todo
    }
}
