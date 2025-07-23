import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CountryLoader {

    // Loads country-capital pairs from a text file into a HashMap.

    public static HashMap<String, String> loadCountries(String filename) {
        HashMap<String, String> countryMap = new HashMap<>();

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            // Opening the file for reading
            fileReader = new FileReader(filename);
            bufferedReader = new BufferedReader(fileReader);

            String line;

            // Reading each line (e.g., "Spain,Madrid")
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");

                // Making sure the line has both country and capital
                if (parts.length == 2) {
                    String country = parts[0].trim();
                    String capital = parts[1].trim();
                    // Putting the pair into the HashMap
                    countryMap.put(country, capital);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());

        } finally {
            // Closing resources to avoid memory leaks
            try {
                if (bufferedReader != null) bufferedReader.close();
                if (fileReader != null) fileReader.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }

        return countryMap;
    }
}
