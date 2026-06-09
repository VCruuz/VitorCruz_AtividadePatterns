import observer.TemperatureObserver;
import observers.ConsoleDisplay;
import observers.FanController;
import subject.WeatherStation;

public class Main {

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        TemperatureObserver display = new ConsoleDisplay();
        TemperatureObserver fan     = new FanController();

        station.subscribe(display);
        station.subscribe(fan);

        station.setTemperature(26);

        station.setTemperature(30);

        station.unsubscribe(display);

        station.setTemperature(27);
    }
}
