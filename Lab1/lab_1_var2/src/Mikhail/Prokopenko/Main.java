package Mikhail.Prokopenko;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String password = "123456";
        String input_line = "";
        while (!input_line.equals(password)){
            System.out.println("Input password: ");
            input_line = reader.readLine();
            if (!input_line.equals(password)){
                System.out.println("Login failed. Try again.");
            } else {
                System.out.println("Login successful!");
            }
        }
    }
}
