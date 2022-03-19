package Projects_Java.Day_4.Homework3.business.concretes;

import Projects_Java.Day_4.Homework3.business.abstracts.PlayerCheckService;
import Projects_Java.Day_4.Homework3.entities.concretes.Player;

public class PlayerCheckManager implements PlayerCheckService {

    @Override
    public boolean checkIfRealPerson(Player player) {
        return true;
    }
}
