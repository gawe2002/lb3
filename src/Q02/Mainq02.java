
package Q02;

import java.util.Scanner;

public class Mainq02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double farenheit = scanner.nextDouble();

        Temperature temperature = new Temperature();
        temperature.setFahrenheit(farenheit);

        System.out.println("Temperature in Celsius: " + temperature.toCelsius());

        scanner.close();
    }
}