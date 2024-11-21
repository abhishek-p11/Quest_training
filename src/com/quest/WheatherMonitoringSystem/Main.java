package com.quest.WheatherMonitoringSystem;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        WeatherSystem weatherSystem = new WeatherSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Weather Monitoring System ---");
            System.out.println("1. Add Weather Data");
            System.out.println("2. Update Weather Data");
            System.out.println("3. Display All Cities");
            System.out.println("4. Display Specific City");
            System.out.println("5. Find Temperature Extremes");
            System.out.println("6. Display High Humidity Cities");
            System.out.println("7. Display Reports");
            System.out.println("8. Display Alerts");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter city name: ");
                    String name = scanner.next();
                    System.out.print("Enter temperature: ");
                    double temp = scanner.nextDouble();
                    System.out.print("Enter humidity: ");
                    int humidity = scanner.nextInt();
                    System.out.print("Enter condition (Sunny, Rainy, Cloudy): ");
                    String condition = scanner.next();
                    weatherSystem.addWeatherData(name, temp, humidity, condition);
                    break;
                case 2:
                    System.out.print("Enter city name to update: ");
                    String city = scanner.next();
                    System.out.print("Enter new temperature: ");
                    double newTemp = scanner.nextDouble();
                    System.out.print("Enter new humidity: ");
                    int newHumidity = scanner.nextInt();
                    System.out.print("Enter new condition: ");
                    String newCondition = scanner.next();
                    weatherSystem.updateWeatherData(city, newTemp, newHumidity, newCondition);
                    break;
                case 3:
                    weatherSystem.displayWeatherData();
                    break;
                case 4:
                    System.out.print("Enter city name: ");
                    String cityName = scanner.next();
                    weatherSystem.displayWeatherData(cityName);
                    break;
                case 5:
                    weatherSystem.findTemperatureExtremes();
                    break;
                case 6:
                    weatherSystem.displayHighHumidityCities();
                    break;
                case 7:
                    weatherSystem.displayReports();
                    break;
                case 8:
                    weatherSystem.displayAlerts();
                    break;
                case 9:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 9);

    }
}
