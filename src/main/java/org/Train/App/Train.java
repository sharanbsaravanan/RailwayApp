package org.Train.App;

import java.util.List;

public class Train {
    private String trainnumber;
    private String name;
    private List<Station> route;
    private Schedule schedule;

    public Train(String trainnumber, String name, List<Station> route, Schedule schedule) {
        this.trainnumber = trainnumber;
        this.name = name;
        this.route = route;
        this.schedule = schedule;
    }

    public String getTrainNumber() {
        return trainnumber;
    }

    public String getName() {
        return name;
    }

    public List<Station> getRoute() {
        return route;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    @Override
    public String toString() {
        return "Train{" +
                "number='" + trainnumber + '\'' +
                ", name='" + name + '\'' +
                ", route=" + route +
                ", schedule=" + schedule +
                '}';
    }
}
