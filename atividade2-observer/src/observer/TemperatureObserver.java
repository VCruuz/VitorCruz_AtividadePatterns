package observer;

/**
 * Interface que define o contrato para todos os observers de temperatura.
 */
public interface TemperatureObserver {
    void onTemperatureChanged(double temp);
}
