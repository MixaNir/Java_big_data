package com.company;

public class Minutes {
    private int minute;

    public Minutes(){}
    public Minutes(int minute){this.minute = minute;}
    public Minutes(Minutes extend){this.minute = extend.minute;}

    public void set_minutes(int minute){this.minute = minute;}

    public int get_minutes(){return this.minute;}
}
