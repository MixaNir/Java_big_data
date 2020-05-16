package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) { //Variant 10
	// write your code here
        int[][] matrix = new int[9][9];
        int[][] newmatrix = new int[9][9];
        try {
            File file = new File("C:\\Users\\Mikhail\\IdeaProjects\\Lab5_3\\src\\com\\company\\lab5_3.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            int i = 0;
            while (line != null) {
                matrix[i] = Arrays.stream(line.split("")).mapToInt(Integer::parseInt).toArray();
                line = reader.readLine();
                i++;
            }
            for (int k = 0; k<9; k++){
                for(int m = 0; m<9; m++){
                    System.out.print(matrix[k][m]);
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
            for (int k = 0; k<9; k++){
                for(int m = 0; m<9; m++){
                    newmatrix[k][m] = matrix[m][k];
                }
            }
            System.out.print("\n\n\n");
            for (int k = 0; k<9; k++){
                for(int m = 0; m<9; m++){
                    System.out.print(newmatrix[k][m]);
                    System.out.print(" ");
                }
                System.out.print("\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
