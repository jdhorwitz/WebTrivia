package com.trivia.service;
 
import java.util.List;
 
import com.trivia.model.Player;
 
public interface PlayerService {
 
    void savePlayer(Player player);
 
    List<Player> findAllPlayers();
 
    void deletePlayerById(String id);
 
    Player findById(String id);
 
    void updatePlayer(Player player);
}