package Projects_Java.Day_4.Homework3.business.concretes;

import Projects_Java.Day_4.Homework3.business.abstracts.GameService;
import Projects_Java.Day_4.Homework3.entities.concretes.Game;

public class GameManager implements GameService {
    @Override
    public void newGame(Game game) {
        System.out.println(game.getGameName() + "İsimli Oyun Eklendi");
    }

    @Override
    public void updateGame(Game game) {
        System.out.println(game.getGameName() + "İsimli Oyun Güncellendi");

    }

    @Override
    public void deleteGame(Game game) {
        System.out.println(game.getGameName() + "İsimli Oyun Silindi");

    }
}
