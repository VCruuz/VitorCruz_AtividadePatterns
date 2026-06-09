package subject;

import observer.TemperatureObserver;
import java.util.ArrayList;
import java.util.List;

/**
 * Subject (fonte de dados) do padrão Observer.
 * Mantém a lista de observers e os notifica sempre que a temperatura muda.
 */
public class WeatherStation {

    private final List<TemperatureObserver> observers = new ArrayList<>();
    private double currentTemperature;

    /** Inscreve um observer para receber atualizações. */
    public void subscribe(TemperatureObserver observer) {
        observers.add(observer);
    }

    /** Remove um observer previamente inscrito. */
    public void unsubscribe(TemperatureObserver observer) {
        observers.remove(observer);
    }

    /**
     * Atualiza a temperatura e notifica todos os observers inscritos.
     */
    public void setTemperature(double temp) {
        this.currentTemperature = temp;
        notifyObservers();
    }

    /** Percorre a lista e dispara o evento em cada observer. */
    private void notifyObservers() {
        for (TemperatureObserver observer : observers) {
            observer.onTemperatureChanged(currentTemperature);
        }
    }
}
