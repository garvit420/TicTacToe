import java.util.List;

import Models.*;

public class Game {
    Board board;
    List<Player> players;
    int nextPlayerMoveIndex;
    Player winner;
    List<Move> moves;
    GameState gameState;
}
