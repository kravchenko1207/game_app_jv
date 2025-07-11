package mate.academy.java8_part1.game_app;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class GameApp {

    public static void main(String[] args) {

        List<Game> games = List.of(
                new Game("Elden Ring", "RPG", 9.5, false),
                new Game("Overwatch", "Shooter", 8.7, true),
                new Game("Hollow Knight", "Platformer", 9.0, false),
                new Game("Valorant", "Shooter", 8.3, true)
        );

        GamePrinter gamePrinter = game -> System.out.println("notes: " + game);
        System.out.println("All games:");
        gamePrinter.printAll(games);

        Consumer<Game> namePrinter = game -> System.out.println("Game: " + game.name);
        System.out.println("\nGame Names:");
        games.forEach(namePrinter);

        Predicate<Game> isShooter = game -> "Shooter".equalsIgnoreCase(game.genre);
        List<Game> shooters = games.stream()
                .filter(isShooter)
                .toList();

        System.out.println("\nShooter Games:");
        shooters.forEach(System.out::println);

        Function<Game, String> getGenre = game -> game.genre;

        System.out.println("\nGenres:");
        games.forEach(game -> System.out.println(getGenre.apply(game)));

        Supplier<Game> randomGameSupplier = () -> {
            List<String> names = List.of("Minecraft", "Resident Evil", "The Witcher", "Metro");
            List<String> genres = List.of("Shooter", "Sandbox", "Adventure", "Party");
            Random random = new Random();

            String name = names.get(random.nextInt(names.size()));
            String genre = genres.get(random.nextInt(genres.size()));
            double rating = 5.0 + random.nextDouble() * 5.0;
            boolean isMultiplayer = random.nextBoolean();

            return new Game(name, genre, Math.round(rating * 10.0) / 10.0, isMultiplayer);
        };

        System.out.println("\nRandomly Generated Game:");
        System.out.println(randomGameSupplier.get());
    }

    static class Game {
        String name;
        String genre;
        double rating;
        boolean isMultiplayer;

        public Game(String name, String genre, double rating, boolean isMultiplayer) {
            this.name = name;
            this.genre = genre;
            this.rating = rating;
            this.isMultiplayer = isMultiplayer;
        }

        @Override
        public String toString() {
            return String.format("Game{name='%s', genre='%s', rating=%.1f, isMultiplayer=%b}",
                    name, genre, rating, isMultiplayer);
        }
    }

    @FunctionalInterface
    interface GamePrinter {
        void print(Game game);

        default void printAll(List<Game> games) {
            games.forEach(this::print);
        }
    }
}

