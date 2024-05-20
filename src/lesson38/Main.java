package lesson38;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num[] = {2, 1, 5, 4, 9, 7};
        Player[] players = {new Player("Smith", 20),
                new Player("Balabey", 18),
                new Player("Juke", 19)};
        System.out.println(Arrays.toString(players));
        Arrays.sort(players);
        System.out.println(Arrays.toString(players));

        System.out.println("----------------");
//        Arrays.sort(players.new Player);

    }
}
