package com.simple.myapplication.observer_event.exp1;

import com.simple.myapplication.observer_event.exp1.DisplayPane.CurrentConditionsDisplay;
import com.simple.myapplication.observer_event.exp1.DisplayPane.ForecastDisplay;
import com.simple.myapplication.observer_event.exp1.DisplayPane.HeatIndexDisplay;
import com.simple.myapplication.observer_event.exp1.DisplayPane.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
//        weatherData.setMeasurements(82, 70, 29.2f);
//        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
