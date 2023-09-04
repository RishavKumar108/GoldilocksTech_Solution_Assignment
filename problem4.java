import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

// 4. Write a program to call a HTTP URL and print the output
// a. URL is http://127.0.0.1:8999/test?value=p
//Time Using : 20 min
public class HttpUrl {
    public static void main(String[] args) {
        String url = "http://127.0.0.1:8999/test?value=p";
        try {
            String response = callHTTPUrl(url);
            System.out.println("HTTP Response:");
            System.out.println(response);
        } catch (IOException e) {
            System.out.println("Error occurring"+e.getMessage());
        }
    }

    public static String callHTTPUrl(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            StringBuilder response = new StringBuilder();
            String inputLine;
            while ((inputLine = reader.readLine()) != null) {
                response.append(inputLine);
            }
            return response.toString();
        }
    }
}