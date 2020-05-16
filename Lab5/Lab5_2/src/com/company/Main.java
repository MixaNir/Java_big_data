package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) { //variant 4
        // write your code here
        Scanner ob = new Scanner(System.in);
        String name = "";
        System.out.println("Input theater name: ");
        try {
            name = ob.nextLine();
        }
        catch (InputMismatchException e) {
            System.out.println("Theater name must be string type");
        }

        String concert = "";
        System.out.println("Input concert name: ");
        try {
            concert = ob.nextLine();
        }
        catch (InputMismatchException e) {
            System.out.println("Theater name must be string type");
        }

        String adress = "";
        System.out.println("Input theater adress: ");
        try {
            adress = ob.nextLine();
        }
        catch (InputMismatchException e) {
            System.out.println("Theater adress must be string type");
        }

        String state = "";
        System.out.println("Input theater state: ");
        try {
            state = ob.nextLine();
        }
        catch (InputMismatchException e) {
            System.out.println("Theater state must be string type");
        }

        int width = 0;
        System.out.println("Input theater width: ");
        try {
            width = ob.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Theater width must be integer type");
        }

        int heidth = 0;
        System.out.println("Input theater width: ");
        try {
            heidth = ob.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Theater heidth must be integer type");
        }
        Theater bigTheater = new Theater(name, concert, width, heidth, adress, state);
        //Theater bigTheater = new Theater(); //For checking Null exeption
        bigTheater.Concert();
        bigTheater.change_meeting("Swan Lake");
        bigTheater.Concert();
        bigTheater.set_building_state("danger");
        bigTheater.Concert();
    }
}
