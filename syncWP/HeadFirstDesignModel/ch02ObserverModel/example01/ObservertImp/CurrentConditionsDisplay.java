package example01.ObservertImp;

import example01.DisplayElement;
import example01.Observer;
import example01.Subject;
import example01.SubjectImp.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherDate) {
		this.weatherData = weatherDate;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions:"+temperature
				+"F degrees and " + humidity + "% humidity"
				);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature=temp;
		this.humidity=humidity;
		display();
	}
	
	public static void main(String args[])
	{
		WeatherData weatherData=new WeatherData();
		CurrentConditionsDisplay d=new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 90, 90.5f);
	}
}
