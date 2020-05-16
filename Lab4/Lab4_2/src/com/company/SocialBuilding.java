package com.company;

public abstract class SocialBuilding implements Building {
    private int width;
    private int heidth;
    private String adress;
    private String state;

    public SocialBuilding(int width, int heidth, String adress, String  state){
        this.width = width;
        this.heidth = heidth;
        this.adress = adress;
        this.state = state;
    }

    public void Concert(){
        if(this.state != "danger"){
            meetings();
        } else {
            repearing();
        }
    }
    @Override
    public void meetings(){
        System.out.println("Meeting started!");
    }
    @Override
    public void repearing(){
        System.out.println("Building need repearing!");
    }

    public void set_building_state(String state){
        this.state = state;
    }
}
