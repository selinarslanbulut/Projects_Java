package Projects_Java.Day4.Homework3.business.abstracts;

import Projects_Java.Day4.Homework3.entities.concretes.Game;

public interface GameService {
    void newGame(Game game);
    void updateGame(Game game);
    void deleteGame(Game game);
}
