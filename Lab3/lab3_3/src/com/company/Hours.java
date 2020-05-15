package com.company;

public class Hours {
    private int hour;
    public Hours(){}
    public Hours(int hour){this.hour = hour;}
    public Hours(Hours extend){this.hour = extend.hour;}

    public void set_hours(int hour){this.hour = hour;}

    public int get_hours(){return this.hour;}
}
