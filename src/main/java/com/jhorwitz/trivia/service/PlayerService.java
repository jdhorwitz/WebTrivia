package com.jhorwitz.trivia.service;
 
import java.util.List;
 
import com.jhorwitz.trivia.model.Player;
 
public interface PlayerService {
 
    void savePlayer(Player player);
 
    List<Player> findAllPlayers();
 
    void deletePlayer(String id);
 
    Player getPlayer(String id);
 
    void updatePlayer(Player player);
}