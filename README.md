# 🎮 GameApp — Java 8 Functional Programming Showcase

A small Java console application that demonstrates the use of **Java 8 functional interfaces** through a simple game-related example. The application allows users to view a list of games, filter them by genre, extract properties using lambda expressions, and even generate a random game using functional programming concepts.

---

## 📌 Overview

This project is designed as an educational tool to practice:

- Functional interfaces (`Consumer`, `Predicate`, `Function`, `Supplier`)
- Stream API
- Lambda expressions
- Custom `@FunctionalInterface`

It's a clean and minimal example that can be used as a starting point for deeper exploration of modern Java features.

---

## ✨ Features

- ✅ Display a list of predefined games
- ✅ Print game names using a `Consumer`
- ✅ Filter games by genre using a `Predicate`
- ✅ Extract game genres using a `Function`
- ✅ Generate a random game using a `Supplier`
- ✅ Use a custom `@FunctionalInterface` (`GamePrinter`)

---

## 📂 Project Structure

```text
mate.academy.java8_part1.game_app
│
├── GameApp.java       # Main class with all functional logic

```

---
## ⚙️ Requirements
Java 8 or higher

No external dependencies

---

## 🚀 How to Run
1. Compile

javac mate/academy/java8_part1/game_app/GameApp.java

2. Run

java mate.academy.java8_part1.game_app.GameApp

---

### 🧪 Sample Output

All games:
notes: Game{name='Elden Ring', genre='RPG', rating=9.5, isMultiplayer=false}
...

Game Names:
Game: Overwatch
Game: Valorant
...

Shooter Games:
Game{name='Overwatch', genre='Shooter', rating=8.7, isMultiplayer=true}
...

Genres:
RPG
Shooter
...

Randomly Generated Game:
Game{name='Metro', genre='Shooter', rating=7.8, isMultiplayer=false}

| Concept          | Usage Example                           |
| ---------------- | --------------------------------------- |
| `Consumer<T>`    | Print game names                        |
| `Predicate<T>`   | Filter games by genre                   |
| `Function<T, R>` | Map games to their genres               |
| `Supplier<T>`    | Generate random game                    |
| Custom Interface | `GamePrinter` with default `printAll()` |

---

## 💡 Future Enhancements (Ideas)
📄 Load game data from a JSON, CSV, or database

🎯 Add filters by rating, genre, or multiplayer status

📊 Sort games by rating or alphabetically

🧪 Add unit tests with JUnit 5

🕸️ Expand into a REST API using Spring Boot

🖥️ Build a GUI version using JavaFX or Swing

## 📃 License
This project is open-source and free to use for learning purposes.

## 👩‍💻 Author
Kravchenko Iryna
GitHub: kravchenko1207
Project created as part of a Java 8 learning initiative.
