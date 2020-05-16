package com.company;

public class Theater extends SocialBuilding {
    public String name;
    public String concert;

    public Theater(String name, String concert, int width, int heidth, String adress, String state){
        super(width, heidth, adress, state);
        this.name = name;
        this.concert = concert;
    }

    @Override
    public void meetings(){
        System.out.println(concert + " started!");
    }

    public void change_meeting(String meet){
        this.concert = meet;
    }
}
