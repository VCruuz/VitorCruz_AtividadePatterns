# Atividade 3 — Decorator

## Objetivo
Demonstrar o padrão **Decorator** combinando canais de notificação (Email, SMS, Slack) de forma dinâmica via composição, sem criar subclasses para cada combinação possível.

## Estrutura

```
atividade3-decorator/
├── README.md
└── src/
    ├── Main.java
    ├── notifier/
    │   ├── Notifier.java              # Interface (contrato)
    │   └── EmailNotifier.java         # Componente concreto base
    └── decorator/
        ├── NotifierDecorator.java     # Decorator base (abstrato)
        ├── SmsDecorator.java          # Decorator concreto
        └── SlackDecorator.java        # Decorator concreto
```

## Como Compilar e Executar

```bash
cd atividade3-decorator/src

# Compilar
javac -d . notifier/*.java decorator/*.java Main.java

# Executar
java Main
```

## Saída Esperada

```
Enviando EMAIL: Olá

Enviando EMAIL: Promoção
Enviando SLACK: Promoção

Enviando EMAIL: Sistema fora
Enviando SMS: Sistema fora
Enviando SLACK: Sistema fora
```

## Conceitos Aplicados
- **Decorator**: comportamentos são empilhados via composição, não herança
- **Transparência**: todos os decorators e o componente base compartilham a interface `Notifier`
- **Combinação dinâmica**: qualquer combinação de canais é possível apenas aninhando objetos
- **Princípio Aberto/Fechado**: adicionar um novo canal (ex: `WhatsAppDecorator`) não altera nenhuma classe existente
