package com.company;

public class Main {

    public static void main(String[] args) { //variant 4
	// write your code here
        Theater bigTheater = new Theater("Big Theater", "Nutcracker", 400, 100, "Moscow", "done");
        bigTheater.Concert();
        bigTheater.change_meeting("Swan Lake");
        bigTheater.Concert();
        bigTheater.set_building_state("danger");
        bigTheater.Concert();
    }
}
