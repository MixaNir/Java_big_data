package com.company;

import java.io.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {//Variant 3
        try {
            File file = new File("C:\\Users\\Mikhail\\IdeaProjects\\Lab7_3\\src\\com\\company\\test.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            HashMap<String, Integer> check = new HashMap<>();
            StringBuffer buf;
            for (String str: line.split(" ")) {
                if (str.indexOf(".") == -1){
                    check.put(str, 0);
                } else {
                    buf = new StringBuffer(str);
                    buf.delete(str.indexOf("."), str.indexOf(".")+1);
                    check.put(buf.toString(), 0);
                }
            }
            line = reader.readLine();
            String[] buf_str;
            while (line != null) {
                buf = new StringBuffer(line);
                buf.delete(line.indexOf("."), line.indexOf(".")+1);
                buf_str = buf.toString().split(" ");
                for (String str: check.keySet()) {
                    for (String s: buf_str) {
                        if (s.equals(str)){
                            check.put(str, check.get(str) + 1);
                        }
                    }
                }
                line = reader.readLine();
            }
            System.out.println("Result:");
            for (String key: check.keySet()) {
                if(check.get(key) == 0){
                    System.out.println(key);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
