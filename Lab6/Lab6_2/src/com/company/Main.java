package com.company;

import java.io.*;
import java.util.*;



public class Main {

    public static void main(String[] args) { //Variant 6
	// write your code here
        float[][] points = {{2, 1}, {4, 2}, {6, 3}, {2, 4}, {5, 4}, {2, 8}, {6, 6}};
        HashMap<String, String> lines = new HashMap<>();
        float k = 0;
        float b = 0;
        float xline = 0;
        boolean key = true;
        String line = "";
        String poin = "";
        for (int i = 0; i < points.length; i++){
            for (int j = i; j < points.length; j++){
                if(i != j){
                    if(k==0 && b==0) {
                        if(points[j][0] - points[i][0] != 0){
                            k = (float) ((points[j][1] - points[i][1]) / (points[j][0] - points[i][0]));
                            b = (float) (k * (points[i][0] * -1) + points[i][1]);
                        } else {
                            xline = points[j][0];
                            key = false;
                        }
                        poin = "[ " + points[i][0] + ", " + points[i][1] + "] ";
                        poin += "[ " + points[j][0] + ", " + points[j][1] + "] ";
                        for (int m = j; m < points.length; m++) {
                            if (m != i && m != j) {
                                if (key){
                                    if (k * points[m][0] + b - points[m][1] == 0) {
                                        line = "y = " + k + "x + " + b;
                                        poin += "[ " + points[m][0] + ", " + points[m][1] + "] ";
                                    }
                                } else {
                                    if (xline == points[m][0]){
                                        line = "x = " + xline;
                                        poin += "[ " + points[m][0] + ", " + points[m][1] + "] ";
                                    }
                                }

                            }
                        }
                        if (line != "" && poin != "") {
                            lines.put(line, poin);
                            line = "";

                        }
                    }
                    key = true;
                    k=0;
                    b=0;

                }
            }
        }

        Set<String> keys = lines.keySet();
        System.out.println("Ключи: " + keys);
        ArrayList<String> values = new ArrayList<>(lines.values());
        System.out.println("Значения: " + values);
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Mikhail\\IdeaProjects\\Lab6_2\\src\\com\\company\\result.txt", false);
            for (String str:keys) {
                writer.write(str + "|" + lines.get(str) + "\n");
            }
            writer.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
