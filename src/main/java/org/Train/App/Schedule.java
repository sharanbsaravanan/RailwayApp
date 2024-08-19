package org.Train.App;

public class Schedule {
    private String depTime;
    private String arrTime;

    public Schedule(String depTime, String arrTime) {
        this.depTime = depTime;
        this.arrTime = arrTime;
    }

    public String getDepTime() {
        return depTime;
    }

    public String getArrTime() {
        return arrTime;
    }

    @Override
    public String toString() {
        return "{" +
                "depTime='" + depTime + '\'' +
                ", arrTime='" + arrTime + '\'' +
                '}';
    }
}
