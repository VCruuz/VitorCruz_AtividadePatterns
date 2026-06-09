# Atividade 2 — Observer

## Objetivo
Demonstrar o padrão **Observer** em uma estação meteorológica (`WeatherStation`) que notifica múltiplos módulos (display e ventilador) sempre que a temperatura muda, com suporte a inscrição e remoção dinâmica de observers.

## Estrutura

```
atividade2-observer/
├── README.md
└── src/
    ├── Main.java                          # Ponto de entrada
    ├── observer/
    │   └── TemperatureObserver.java       # Interface (contrato dos observers)
    ├── subject/
    │   └── WeatherStation.java            # Subject — mantém e notifica a lista
    └── observers/
        ├── ConsoleDisplay.java            # Observer concreto: exibe no console
        └── FanController.java             # Observer concreto: controla ventilador
```

## Como Compilar e Executar

```bash
cd atividade2-observer/src

# Compilar
javac -d . observer/*.java subject/*.java observers/*.java Main.java

# Executar
java Main
```

## Saída Esperada

```
Display: temperatura = 26.0
Ventilador: DESLIGAR
Display: temperatura = 30.0
Ventilador: LIGAR
Ventilador: DESLIGAR
```
> Na última atualização (27°), o `ConsoleDisplay` já foi removido, então apenas o `FanController` é notificado.

## Conceitos Aplicados
- **Observer**: observers se inscrevem no subject e são notificados automaticamente a cada mudança
- **Desacoplamento**: `WeatherStation` não conhece os tipos concretos dos observers, só a interface
- **Remoção dinâmica**: `unsubscribe()` permite que um observer deixe de receber eventos em tempo de execução
- **Princípio Aberto/Fechado**: adicionar um novo observer (ex: `LoggerObserver`) não exige alterar `WeatherStation`
