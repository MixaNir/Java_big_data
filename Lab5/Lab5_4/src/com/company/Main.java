package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) { //Variant 1
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Mikhail\\Desktop\\Java\\Java_big_data\\Lab5\\Lab5_4\\src\\com\\company\\Fraction1.java", false);
            File file = new File("C:\\Users\\Mikhail\\Desktop\\Java\\Java_big_data\\Lab5\\Lab5_4\\src\\com\\company\\Fraction.java");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();

            while (line != null) {
                if(line.indexOf("public")!=-1){
                    writer.write(line.replace("public", "private"));
                }else {
                    writer.write(line);
                }
                writer.append('\n');
                line = reader.readLine();
            }
            writer.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
