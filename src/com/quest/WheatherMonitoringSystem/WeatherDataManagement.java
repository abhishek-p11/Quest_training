package com.quest.WheatherMonitoringSystem;

public class WeatherDataManagement {
    private String cityName;
    private double temperature;
    private int humidity;
    private String condition;

    public WeatherDataManagement(String cityName, double temperature, int humidity, String condition) {
        this.cityName = cityName;
        this.temperature = temperature;
        this.humidity = humidity;
        this.condition = condition;
    }

    // Getters and setters (Encapsulation)
    public String getCityName() {
        return cityName;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "City: " + cityName + ", Temperature: " + temperature + "°C, Humidity: " + humidity + "%, Condition: " + condition;
    }
}
