package com.jhorwitz.trivia.dao;
 
import java.util.Date;
import java.util.List;
 
import com.jhorwitz.trivia.model.Player;
 
public interface PlayerDao {
 
    void savePlayer(Player player);
     
    List<Player> findAllPlayers();
     
    void deletePlayer(String id);
     
    Player getPlayer(String id);
     
    void updatePlayer(String id, String name, int score, String team, Date date, String username);
}