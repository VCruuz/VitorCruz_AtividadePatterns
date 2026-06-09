# Atividade 1 — Factory Method

## Objetivo
Demonstrar o padrão **Factory Method** em um sistema de notificações com múltiplos canais (Email, SMS, Push), sem que o código cliente conheça as implementações concretas.

## Estrutura

```
atividade1-factory-method/
└── src/
    ├── Main.java                          # Ponto de entrada
    ├── notifications/
    │   ├── Notification.java              # Interface (contrato)
    │   ├── EmailNotification.java         # Implementação concreta
    │   ├── SMSNotification.java           # Implementação concreta
    │   └── PushNotification.java          # Implementação concreta
    ├── factory/
    │   ├── NotificationFactory.java       # Classe abstrata com Factory Method
    │   ├── EmailNotificationFactory.java  # Factory concreta
    │   ├── SMSNotificationFactory.java    # Factory concreta
    │   └── PushNotificationFactory.java   # Factory concreta
    └── service/
        └── NotificationService.java       # Serviço que usa a factory
```

## Como Compilar e Executar

```bash
cd atividade1-factory-method/src

# Compilar
javac -d . notifications/*.java factory/*.java service/*.java Main.java

# Executar
java Main
```

## Saída Esperada

```
EmailFactory enviando: "Bem-vindo ao sistema!"
SMSFactory enviando: "Bem-vindo ao sistema!"
PushFactory enviando: "Bem-vindo ao sistema!"
```

## Conceitos Aplicados
- **Factory Method**: o método `createNotification()` em `NotificationFactory` é sobrescrito por cada factory concreta
- **Polimorfismo**: `NotificationService` trabalha com `Notification` e `NotificationFactory` sem conhecer tipos concretos
- **Princípio Aberto/Fechado**: adicionar um novo canal (ex: WhatsApp) exige apenas uma nova classe de notificação e uma nova factory, sem alterar código existente
