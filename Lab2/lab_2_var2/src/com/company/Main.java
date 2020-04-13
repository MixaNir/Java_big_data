package com.company;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[][] matrix;
        System.out.print("Input matrix dimention: ");
        String str = reader.readLine();
        int matrix_num = Integer.parseInt(str);
        matrix = new int[matrix_num][matrix_num];
        Random random = new Random();
        System.out.println("Source matrix:");
        for(int i = 0; i < matrix_num; i++){
            for (int j = 0; j < matrix_num; j++){
                matrix[i][j] = -matrix_num + random.nextInt(matrix_num - (-matrix_num) + 1);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        int buff = 0;
        for(int i = 0; i < matrix_num; i++){
            for (int j = i; j < matrix_num; j++){
                buff = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = buff;
            }
        }
        System.out.println("");
        System.out.println("Transposed matrix:");
        for(int i = 0; i < matrix_num; i++){
            for (int j = 0; j < matrix_num; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
