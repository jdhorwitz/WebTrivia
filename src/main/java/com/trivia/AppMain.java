package com.trivia;
 
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.trivia.configuration.AppConfig;
import com.trivia.model.Player;
import com.trivia.service.PlayerService;
 
public class AppMain {
 
    public static void main(String args[]) {
    	
    	Date currentDate = new Date();
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
 
        PlayerService service = (PlayerService) context.getBean("playerService");
 
        /*
         * Create Player1
         */
        Player player1 = new Player();
        player1.setName("Han Yenn");
        player1.setId(1);
        player1.setScore(0);
        player1.setTeam("red");
        player1.setUpdatedTime(currentDate);
        player1.setUsername("hanyenn");
       
 
        /*
         * Create player2
         */
        Player player2 = new Player();
        player2.setName("Dan Thomas");
        player2.setId(2);
        player2.setScore(0);
        player2.setTeam("red");
        player2.setUpdatedTime(currentDate);
        player2.setUsername("danthomas");
 
        /*
         * Persist both players
         */
        service.savePlayer(player1);
        service.savePlayer(player2);
 
        /*
         * Get all players list from database
         */
        List<Player> players = service.findAllPlayers();
        for (Player ply : players) {
            System.out.println(ply);
        }
 
        /*
         * delete an player
         */
        service.deletePlayerById("1");
 
        /*
         * update an player
         */
 
        Player player = service.findById("2");
        player.setScore(99);
        service.updatePlayer(player);
 
        /*
         * Get all players list from database
         */
        List<Player> playerList = service.findAllPlayers();
        for (Player ply : playerList) {
            System.out.println(ply);
        }
 
        context.close();
    }
}
