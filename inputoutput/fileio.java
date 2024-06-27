package inputoutput;

import java.io.*;

public class fileio {
    public static void main(String[] args) {
        // Write to the file
        writeFile("output.txt");

        // Read from the file
        readFile("output.txt");
    }

    // Method to write to a file
    public static void writeFile(String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write("This is an example of writing to a file.");
            bw.newLine();
            bw.write("This is another line of text.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read from a file
    public static void readFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
