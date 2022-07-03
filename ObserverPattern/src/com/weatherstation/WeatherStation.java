package com.weatherstation;

public class WeatherStation {
    
	public static void main(String [] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		
		weatherData.setMeasurements(80, 65, 29.2f);
		
	}
}
