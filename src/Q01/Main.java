
package Q02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature value in  Celsius: ");
        double input = scanner.nextDouble();

        Temperature temperature = new Temperature(input);

        System.out.println(" Fahrenheit value: " + temperature.toFahrenheit());

        scanner.close();
    }
}