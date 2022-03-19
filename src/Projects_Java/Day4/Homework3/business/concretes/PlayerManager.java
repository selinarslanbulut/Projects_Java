package Projects_Java.Day4.Homework3.business.concretes;

import Projects_Java.Day4.Homework3.business.abstracts.PlayerCheckService;
import Projects_Java.Day4.Homework3.business.abstracts.PlayerService;
import Projects_Java.Day4.Homework3.entities.concretes.Player;

public class PlayerManager implements PlayerService {
    private PlayerCheckService playerCheckService;
    public PlayerManager(PlayerCheckService playerCheckService){
        this.playerCheckService=playerCheckService;
    }
    @Override
    public void register(Player player) {

    }

    @Override
    public void update(Player player) {

    }

    @Override
    public void delete(Player player) {

    }
}
