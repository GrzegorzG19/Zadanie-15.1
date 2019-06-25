import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FromFileFill {

    Map<String, Country> readCountries(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int lines = countLines(fileName);
        Country[] countries = new Country[lines];
        int i = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            String[] split = nextLine.split(";");
            countries[i] = new Country(split[0], split[1], Integer.valueOf(split[2]));
            i++;
        }

        Map<String, Country> worldCountry = new HashMap<>();

        for (Country country : countries) {
            worldCountry.put(country.getSmall(),country);
        }

        return worldCountry;
    }

    private int countLines(String fileName) throws FileNotFoundException {
        int noOfLines = 0;
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNextLine()) {
            noOfLines++;
            scanner.nextLine();
        }
        scanner.close();
        return noOfLines;
    }
}

