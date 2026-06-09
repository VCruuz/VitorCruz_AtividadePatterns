package observers;

import observer.TemperatureObserver;

/**
 * Observer concreto que controla o ventilador com base na temperatura.
 * Liga quando temp > 28, desliga caso contrário.
 */
public class FanController implements TemperatureObserver {

    @Override
    public void onTemperatureChanged(double temp) {
        if (temp > 28) {
            System.out.println("Ventilador: LIGAR");
        } else {
            System.out.println("Ventilador: DESLIGAR");
        }
    }
}
