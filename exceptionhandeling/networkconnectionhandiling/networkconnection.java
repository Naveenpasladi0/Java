package exceptionhandeling.networkconnectionhandiling;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class networkconnection {
    public static void main(String[] args) {
        String urlString = "https://www.google.com/"; // Replace with your URL
        HttpURLConnection connection = null;

        try {
            URL url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("Successfully Connected to the server.");
            } else {
                System.out.println("Failed to connect to the server, Response code: " + responseCode);
            }
        } catch (MalformedURLException e) {
            System.out.println("The URL is malformed: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred during the connection: " + e.getMessage());
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}