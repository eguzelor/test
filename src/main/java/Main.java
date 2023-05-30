import java.io.IOException;
import java.net.*;
import java.util.*;


class Main {
    
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://catfact.ninja/fact");

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();

        StringBuilder informationString = new StringBuilder();
        Scanner scanner = new Scanner(url.openStream());

        while (scanner.hasNext()) {
            informationString.append(scanner.nextLine());
        }

            


    }

}
