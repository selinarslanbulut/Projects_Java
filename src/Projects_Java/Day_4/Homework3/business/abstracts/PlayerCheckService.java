package Projects_Java.Day_4.Homework3.business.abstracts;

import Projects_Java.Day_4.Homework3.entities.concretes.Player;

public interface PlayerCheckService {
    boolean checkIfRealPerson(Player player);
}
