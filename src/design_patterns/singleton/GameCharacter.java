package design_patterns.singleton;

public class GameCharacter {
    private static GameCharacter gameCharacter;
    private static String newOption = "add new optin \n";

    private GameCharacter() {

    }

    public static GameCharacter getInstance() {
        if (gameCharacter == null) {
            gameCharacter = new GameCharacter();
        }
        return gameCharacter;
    }

    public void addOption() {


    }
}
