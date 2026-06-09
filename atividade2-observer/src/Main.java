import observer.TemperatureObserver;
import observers.ConsoleDisplay;
import observers.FanController;
import subject.WeatherStation;

/**
 * Classe principal — demonstra o uso do padrão Observer.
 *
 * Fluxo:
 *  1. Ambos os observers recebem a atualização de 26°
 *  2. Ambos recebem a de 30°
 *  3. ConsoleDisplay é removido; apenas FanController recebe a de 27°
 */
public class Main {

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        TemperatureObserver display = new ConsoleDisplay();
        TemperatureObserver fan     = new FanController();

        station.subscribe(display);
        station.subscribe(fan);

        station.setTemperature(26);   // display + fan notificados
        station.setTemperature(30);   // display + fan notificados

        station.unsubscribe(display); // display removido

        station.setTemperature(27);   // apenas fan notificado
    }
}
