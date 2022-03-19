package Projects_Java.Day_4.Homework3.business.concretes;

import Projects_Java.Day_4.Homework3.business.abstracts.SalesService;
import Projects_Java.Day_4.Homework3.entities.concretes.Campaign;
import Projects_Java.Day_4.Homework3.entities.concretes.Game;
import Projects_Java.Day_4.Homework3.entities.concretes.Player;

public class SalesManager implements SalesService {
    @Override
    public void sell(Game game, Player player, Campaign campaign) {
        System.out.println(game.getGameName()+ " İsimli Oyunu" + player.getUsername()+ " Kullanıcı İsimli Üyeye "+campaign.getCampaignName()+" Kampanyası İle Satılmıştır.");
    }
}
