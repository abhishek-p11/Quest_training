package com.quest.WheatherMonitoringSystem;

interface WeatherOperations {
    void addWeatherData(String cityName, double temperature, int humidity, String condition);

    void updateWeatherData(String cityName, double temperature, int humidity, String condition);

    void displayWeatherData();

    void displayWeatherData(String cityName);

    void findTemperatureExtremes();

    void displayHighHumidityCities();

    void displayReports();

    void displayAlerts();
}
