package observers;

import observer.TemperatureObserver;

/**
 * Observer concreto que exibe a temperatura no console.
 */
public class ConsoleDisplay implements TemperatureObserver {

    @Override
    public void onTemperatureChanged(double temp) {
        System.out.println("Display: temperatura = " + temp);
    }
}
