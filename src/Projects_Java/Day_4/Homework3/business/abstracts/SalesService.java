package Projects_Java.Day_4.Homework3.business.abstracts;

import Projects_Java.Day_4.Homework3.entities.concretes.Campaign;
import Projects_Java.Day_4.Homework3.entities.concretes.Game;
import Projects_Java.Day_4.Homework3.entities.concretes.Player;

public interface SalesService {
    void sell(Game game, Player player, Campaign campaign);
}
