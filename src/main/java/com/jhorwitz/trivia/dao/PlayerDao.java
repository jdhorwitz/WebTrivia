package com.jhorwitz.trivia.dao;
 
import java.util.List;
 
import com.jhorwitz.trivia.model.Player;
 
public interface PlayerDao {
 
    void savePlayer(Player player);
     
    List<Player> findAllPlayers();
     
    void deletePlayerById(String id);
     
    Player findById(String id);
     
    void updatePlayer(Player player);
}