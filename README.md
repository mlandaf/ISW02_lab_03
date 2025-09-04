# Laboratorio 03: Patrones Creacionales (Versión Simplificada)

- **Curso**: Ingeniería de Software II
- **Aula**: 851
- **Fecha**: 03/10/2025
- **Jefe de prácticas**: Sebastián Chávarry

---

## Caso de Estudio: Sistema de Juegos Básico

Una empresa desarrolladora necesita un sistema simple para crear juegos y gestionar configuraciones. El sistema debe manejar diferentes tipos de juegos y mantener configuraciones únicas.

---

## Preparación del Proyecto

1. Crea 3 paquetes:
   - `ejercicio01` - Factory Method
   - `ejercicio02` - Abstract Factory
   - `ejercicio03` - Singleton

---

## Ejercicio 1: Factory Method Pattern

### 1) Diagrama del Código Actual (Problemático):

```mermaid
classDiagram
    class GameCreator {
        +createGame(String type) Game
    }

    class Game {
        <<abstract>>
        #String name
        #String genre
        +start()* void
        +getInfo() String
    }

    class RPGGame {
        +start() void
    }

    class FPSGame {
        +start() void
    }

    GameCreator --> Game : creates
    Game <|-- RPGGame
    Game <|-- FPSGame

    note for GameCreator "❌ Usa switch/if-else
    para decidir qué crear"
```

### 2) Diagrama de la Solución (Factory Method):

```mermaid
classDiagram
    class GameFactory {
        <<abstract>>
        +createGame()* Game
        +playGame() void
    }

    class RPGFactory {
        +createGame() Game
    }

    class FPSFactory {
        +createGame() Game
    }

    class Game {
        <<abstract>>
        #String name
        +start()* void
        +getInfo() String
    }

    class RPGGame {
        +start() void
    }

    class FPSGame {
        +start() void
    }

    GameFactory <|-- RPGFactory
    GameFactory <|-- FPSFactory
    Game <|-- RPGGame
    Game <|-- FPSGame
    RPGFactory ..> RPGGame : creates
    FPSFactory ..> FPSGame : creates

    note for GameFactory "✅ Cada factory se especializa
    en crear un tipo específico"
```

#### **Implementa la solución creando:**

- `GameFactory` (abstracto) con `createGame()` abstracto y `playGame()` concreto
- `RPGFactory` y `FPSFactory` que extiendan `GameFactory`
- `PuzzleFactory` para demostrar extensibilidad

---

## Ejercicio 2: Abstract Factory Pattern

### 1) Diagrama del Código Actual (Problemático):

```mermaid
classDiagram
    class GameElementCreator {
        +createCharacter(String platform, String type) Character
        +createWeapon(String platform, String type) Weapon
    }

    class Character {
        <<abstract>>
        #String name
        #String platform
        +attack()* void
    }

    class Weapon {
        <<abstract>>
        #String name
        #String platform
        +use()* void
    }

    class Warrior {
        +attack() void
    }

    class Sword {
        +use() void
    }

    GameElementCreator --> Character : creates
    GameElementCreator --> Weapon : creates
    Character <|-- Warrior
    Weapon <|-- Sword

    note for GameElementCreator "❌ No garantiza compatibilidad
    entre personajes y armas"
```

### 2) Diagrama de la Solución (Abstract Factory):

```mermaid
classDiagram
    class GameElementFactory {
        <<abstract>>
        +createWarrior()* Character
        +createWeapon()* Weapon
    }

    class PCFactory {
        +createWarrior() Character
        +createWeapon() Weapon
    }

    class MobileFactory {
        +createWarrior() Character
        +createWeapon() Weapon
    }

    class Character {
        <<abstract>>
        #String name
        #String platform
        +attack()* void
    }

    class Weapon {
        <<abstract>>
        #String name
        #String platform
        +use()* void
    }

    class PCWarrior {
        +attack() void
    }

    class MobileWarrior {
        +attack() void
    }

    class PCSword {
        +use() void
    }

    class MobileSword {
        +use() void
    }

    GameElementFactory <|-- PCFactory
    GameElementFactory <|-- MobileFactory
    Character <|-- PCWarrior
    Character <|-- MobileWarrior
    Weapon <|-- PCSword
    Weapon <|-- MobileSword

    PCFactory ..> PCWarrior : creates
    PCFactory ..> PCSword : creates
    MobileFactory ..> MobileWarrior : creates
    MobileFactory ..> MobileSword : creates

    note for GameElementFactory "✅ Garantiza familias
    compatibles de objetos"
```

#### **Implementa la solución creando:**

- `GameElementFactory` (interface) con métodos de creación
- `PCFactory` y `MobileFactory` que implementen la interface
- Clases específicas: `PCWarrior`, `MobileWarrior`, `PCSword`, `MobileSword`
- Cliente que use una factory sin conocer implementaciones específicas

---

## Ejercicio 3: Singleton Pattern

### 1) Diagrama del Código Actual (Problemático):

```mermaid
classDiagram
    class GameConfig {
        -String databaseUrl
        -boolean debugMode
        -int maxPlayers
        +GameConfig()
        +getDatabaseUrl() String
        +setDebugMode(boolean) void
        +getMaxPlayers() int
    }

    class GameSession {
        -GameConfig config
        +GameSession()
        +startSession() void
    }

    class NetworkManager {
        -GameConfig config
        +NetworkManager()
        +connect() void
    }

    class DatabaseManager {
        -GameConfig config
        +DatabaseManager()
        +saveData() void
    }

    GameSession --> GameConfig : config = new GameConfig()
    NetworkManager --> GameConfig : config = new GameConfig()
    DatabaseManager --> GameConfig : config = new GameConfig()

    note for GameConfig "❌ Múltiples instancias
    con configuraciones diferentes"
```

### 2) Diagrama de la Solución (Singleton):

```mermaid
classDiagram
    class GameConfig {
        -static GameConfig instance
        -String databaseUrl
        -boolean debugMode
        -int maxPlayers
        -GameConfig()
        +static getInstance() GameConfig
        +getDatabaseUrl() String
        +setDebugMode(boolean) void
        +getMaxPlayers() int
    }

    class GameSession {
        +startSession() void
    }

    class NetworkManager {
        +connect() void
    }

    class DatabaseManager {
        +saveData() void
    }

    GameSession ..> GameConfig : getInstance()
    NetworkManager ..> GameConfig : getInstance()
    DatabaseManager ..> GameConfig : getInstance()

    note for GameConfig "✅ Una sola instancia
    compartida globalmente"
```

#### **Implementa la solución creando:**

- `GameConfig` singleton thread-safe con `getInstance()`
- `NetworkConfig` singleton usando enum
- Modificar los clientes para usar `getInstance()` en lugar de `new`

---

_Enfócate en entender por qué el código inicial es problemático antes de implementar la solución._
