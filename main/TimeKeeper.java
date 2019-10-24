package main;

public class TimeKeeper {
    private double hours;
    private double minutes;
    private double seconds;

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getMinutes() {
        return minutes;
    }

    public void setMinutes(double minutes) {
        this.minutes = minutes;
    }

    public double getSeconds() {
        return seconds;
    }

    public void setSeconds(double seconds) {
        this.seconds = seconds;
    }

    public TimeKeeper(double hours, double minutes, double seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    /*public TimeKeeper() {
        hours = this.setHours();
        minutes = this.setMinutes();
        seconds = this.setSeconds();
    }*/

    private int CalculateSeconds() {
        return (int)getHours()*3600 + (int)getMinutes()*60 + (int)getSeconds();
    }

    private double CalculateDayPercentage() {
        return ((CalculateSeconds() * 100 )/ (24*3600));
    }

    @Override
    public String toString() {
        return "The given time is :- " + (int)getHours() + ":" + (int)getMinutes() + ":" + (int)getSeconds() + "\n" +
                CalculateSeconds() + " are the total no. of Seconds pass since midnight.\n" +
                CalculateDayPercentage() + "% day is passed till the given time.";
    }
}
