import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        FromFileFill countryReader = new FromFileFill();
        Map<String, Country> worldCountry = countryReader.readCountries("panstwa.csv");

        System.out.println("Dostępne kraje: ");
        Set<String> keys = worldCountry.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        System.out.println("Jaki kraj chcesz?");

        String key = scan.nextLine();
        Country foungKey = worldCountry.get(key);
        System.out.println(foungKey.full + " " + foungKey.small + " ma " + foungKey.people + " ludności");

    }
}
