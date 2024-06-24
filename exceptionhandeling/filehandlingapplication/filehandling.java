package exceptionhandeling.filehandlingapplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class filehandling {
    public static void main(String[] args) {
        String filePath = "exaple.txt"; // Replace with your file path
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the file: " + e.getMessage());
            }
        }
    }
}