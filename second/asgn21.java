package Assgn.second;
    import java.util.HashMap;
import java.util.Map;
    import java.util.Scanner;

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class asgn21 {



    // Method to get the capital of the country
    public static String getCapital(String country) throws NoMatchFoundException {
        Map<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("England", "London");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("Netherlands", "Amsterdam");

        String capital = countryCapitals.get(country);
        if (capital == null) {
            throw new NoMatchFoundException("No match found for the country: " + country);
        }
        return capital;
    }

    public static void main(String[] args)
    { Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the country:");
        String country = scanner.nextLine(); try { String capital = getCapital(country);
            System.out.println("The capital of " + country + " is " + capital);
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}


