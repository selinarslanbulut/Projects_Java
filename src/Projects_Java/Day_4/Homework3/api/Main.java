package Projects_Java.Day_4.Homework3.api;

import Projects_Java.Day_4.Homework3.business.abstracts.PlayerService;
import Projects_Java.Day_4.Homework3.business.concretes.GameManager;
import Projects_Java.Day_4.Homework3.business.concretes.PlayerCheckManager;
import Projects_Java.Day_4.Homework3.business.concretes.PlayerManager;
import Projects_Java.Day_4.Homework3.business.concretes.SalesManager;
import Projects_Java.Day_4.Homework3.entities.concretes.Campaign;
import Projects_Java.Day_4.Homework3.entities.concretes.Game;
import Projects_Java.Day_4.Homework3.entities.concretes.Player;

public class Main {
    public static void main(String[] args){
        Game game1 = new Game(1,"Valorant", 35);
        Player player1=new Player(1," selinarslanbulut","Selin","ARSLANBULUT","12345678912","4 Mayıs 1997");
        Campaign campaign1=new Campaign(1,"Yeni Sezon Oyun İndirimi",25);
        PlayerService playerService=new PlayerManager(new PlayerCheckManager());
        GameManager gameManager=new GameManager();
        gameManager.newGame(game1);
        playerService.register(player1);
        SalesManager salesManager=new SalesManager();
        salesManager.sell(game1,player1,campaign1);


    }
}
