package com.company;

public class Day {
    private Hours hour;
    private Minutes minute;

    public Day(){}
    public Day(int hour, int minute){
        this.hour = new Hours(hour);
        this.minute = new Minutes(minute);
    }
    public Day(Day extend){
        this.hour = extend.hour;
        this.minute = extend.minute;
    }
    @Override
    public String toString(){
        return "Current time:" + Integer.toString(this.hour.get_hours()) + ":" + Integer.toString(this.minute.get_minutes());
    }

    public void print_time(){
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object o){
        Day extend = (Day) o;
        boolean result = false;
        if (this.hour.get_hours() == extend.hour.get_hours() && this.minute.get_minutes() == extend.minute.get_minutes())
            result = true;
        return result;
    }
    @Override
    public int hashCode() {
        int result = this.hour.get_hours()*60;
        result += this.minute.get_minutes();
        return result;
    }

    public String get_daytime(){
        String result = "";
        if (this.hour.get_hours() >= 0 && this.hour.get_hours() < 6)
            result = "night";
        else if(this.hour.get_hours() >= 6 && this.hour.get_hours() < 12)
            result = "morning";
        else if(this.hour.get_hours() >= 12 && this.hour.get_hours() < 18)
            result = "afternoon";
        else if(this.hour.get_hours() >= 18 && this.hour.get_hours() < 24)
            result = "evening";
        return result;
    }

    public void print_daytime(){
        System.out.println(this.get_daytime());
    }
}
