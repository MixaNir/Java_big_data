package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) { //Variant 1
	// write your code here
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Mikhail\\IdeaProjects\\Lab5_4\\src\\com\\company\\Fraction1.java", false);
            File file = new File("C:\\Users\\Mikhail\\IdeaProjects\\Lab5_4\\src\\com\\company\\Fraction.java");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();

            while (line != null) {
                //matrix[i] = Arrays.stream(line.split("")).mapToInt(Integer::parseInt).toArray();
                //System.out.print(line.split(" ")[0] + "\n");
                if(line.indexOf("public")!=-1){
                    writer.write(line.replace("public", "private"));
                }else {
                    writer.write(line);
                }
                writer.append('\n');
                System.out.print("\n");
                line = reader.readLine();
                //i++;
            }
            writer.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
