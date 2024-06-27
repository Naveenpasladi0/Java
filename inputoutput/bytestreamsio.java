package inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytestreamsio {
    public static void main(String[] args) {
        // Write to the file using byte streams
        writeFile("outbin.txt");

        // Read from the file using byte streams
        readFile("outbin.txt");
    }

    // Method to write to a file using byte streams
    public static void writeFile(String filename) {
        String data = "This is some binary data.";
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read from a file using byte streams
    public static void readFile(String filename) {
        try (FileInputStream fis = new FileInputStream(filename)) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            System.out.println(); // To add a newline after the output
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}