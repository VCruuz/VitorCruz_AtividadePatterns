package subject;

import observer.TemperatureObserver;
import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    private final List<TemperatureObserver> observers = new ArrayList<>();
    private double currentTemperature;

    public void subscribe(TemperatureObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(TemperatureObserver observer) {
        observers.remove(observer);
    }

    public void setTemperature(double temp) {
        this.currentTemperature = temp;
        notifyObservers();
    }

    private void notifyObservers() {
        for (TemperatureObserver observer : observers) {
            observer.onTemperatureChanged(currentTemperature);
        }
    }
}
