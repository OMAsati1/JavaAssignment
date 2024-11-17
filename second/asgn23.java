package Assgn.second;
    import java.util.Scanner;

    class TooHotException extends Exception {
    public TooHotException(String message) {
        super(message);
    }
}

class TooColdException extends Exception {
    public TooColdException(String message) {
        super(message);
    }
}

public class asgn23 {

    // Method to check the temperature and possibly throw exceptions
    public static void checkTemperature(double temperature) throws TooHotException, TooColdException {
        if (temperature > 35) {
            throw new TooHotException("Temperature is too hot: " + temperature + "°C");
        } else if (temperature < 5) {
            throw new TooColdException("Temperature is too cold: " + temperature + "°C");
        } else {
            System.out.println("Normal temperature: " + temperature + "°C");
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
        }
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the temperature in Celsius:");

        try {
            double temperature = scanner.nextDouble();
            checkTemperature(temperature);
        } catch (TooHotException | TooColdException e) {
            System.out.println(e.getMessage());
        }
    }
}


