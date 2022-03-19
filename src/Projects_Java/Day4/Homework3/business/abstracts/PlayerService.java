package Projects_Java.Day4.Homework3.business.abstracts;

import Projects_Java.Day4.Homework3.entities.concretes.Player;

public interface PlayerService {
    void register(Player player);
    void update(Player player);
    void delete(Player player);
}
