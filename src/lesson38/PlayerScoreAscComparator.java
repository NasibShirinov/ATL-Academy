package lesson38;

import java.util.Comparator;

public class PlayerScoreAscComparator implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2) {
        return p2.getName().compareTo(p1.getName());
    }
}
