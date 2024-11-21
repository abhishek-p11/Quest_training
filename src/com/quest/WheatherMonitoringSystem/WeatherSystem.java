package com.quest.WheatherMonitoringSystem;

class WeatherSystem implements WeatherOperations {
    private WeatherDataManagement[] cities = new WeatherDataManagement[10];
    private int cityCount = 0;

    @Override
    public void addWeatherData(String cityName, double temperature, int humidity, String condition) {
        if (cityCount >= cities.length) {
            System.out.println("City limit reached.");
            return;
        }
        cities[cityCount++] = new WeatherDataManagement(cityName, temperature, humidity, condition);
        System.out.println("Weather data for " + cityName + " added.");
    }

    @Override
    public void updateWeatherData(String cityName, double temperature, int humidity, String condition) {
        for (int i = 0; i < cityCount; i++) {
            if (cities[i].getCityName().equalsIgnoreCase(cityName)) {
                cities[i].setTemperature(temperature);
                cities[i].setHumidity(humidity);
                cities[i].setCondition(condition);
                System.out.println("Weather data for " + cityName + " updated.");
                return;
            }
        }
        System.out.println("City not found.");
    }

    @Override
    public void displayWeatherData() {
        System.out.println("Displaying weather data for all cities:");
        for (int i = 0; i < cityCount; i++) {
            System.out.println(cities[i]);
        }
    }

    @Override
    public void displayWeatherData(String cityName) {
        for (int i = 0; i < cityCount; i++) {
            if (cities[i].getCityName().equalsIgnoreCase(cityName)) {
                System.out.println(cities[i]);
                return;
            }
        }
        System.out.println("City not found.");
    }

    @Override
    public void findTemperatureExtremes() {
        if (cityCount == 0) {
            System.out.println("No cities available.");
            return;
        }
        WeatherDataManagement highest = cities[0], lowest = cities[0];
        for (int i = 1; i < cityCount; i++) {
            if (cities[i].getTemperature() > highest.getTemperature()) highest = cities[i];
            if (cities[i].getTemperature() < lowest.getTemperature()) lowest = cities[i];
        }
        System.out.println("Highest Temperature: " + highest.getCityName() + " (" + highest.getTemperature() + "°C)");
        System.out.println("Lowest Temperature: " + lowest.getCityName() + " (" + lowest.getTemperature() + "°C)");
    }

    @Override
    public void displayHighHumidityCities() {
        boolean found = false;
        System.out.println("Cities with Humidity > 80%:");
        for (int i = 0; i < cityCount; i++) {
            if (cities[i].getHumidity() > 80) {
                System.out.println(cities[i]);
                found = true;
            }
        }
        if (!found) System.out.println("No cities found.");
    }

    @Override
    public void displayReports() {
        System.out.println("Cities grouped by weather condition:");
        for (String condition : new String[]{"Sunny", "Rainy", "Cloudy"}) {
            System.out.print("- " + condition + ": ");
            boolean found = false;
            for (int i = 0; i < cityCount; i++) {
                if (cities[i].getCondition().equalsIgnoreCase(condition)) {
                    System.out.print(cities[i].getCityName() + " ");
                    found = true;
                }
            }
            if (!found) System.out.print("None");
            System.out.println();
        }

        double totalTemperature = 0;
        for (int i = 0; i < cityCount; i++) totalTemperature += cities[i].getTemperature();
        System.out.println("Average Temperature: " + (totalTemperature / cityCount) + "°C");
    }

    @Override
    public void displayAlerts() {
        for (int i = 0; i < cityCount; i++) {
            if (cities[i].getTemperature() > 40) {
                System.out.println("Heatwave Alert: " + cities[i].getCityName() + " is experiencing extreme heat (" + cities[i].getTemperature() + "°C)!");
            }
            if (cities[i].getHumidity() < 20) {
                System.out.println("Low Humidity Warning: " + cities[i].getCityName() + " has very low humidity (" + cities[i].getHumidity() + "%)!");
            }
        }
    }
}

