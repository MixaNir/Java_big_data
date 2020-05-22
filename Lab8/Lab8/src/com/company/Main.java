package com.company;
class LestStep extends Thread {
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.printf("LEFT\n");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
        }
    }
}
class RightStep extends Thread {
    public void run(){
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        for (int i = 0; i < 10; i++){
            System.out.printf("RIGHT\n");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
        }
    }
}
public class Main {

    public static void main(String[] args) { //Variant 2
        new LestStep().start();
        new RightStep().start();
    }
}
