package com.trivia.spring.service;
 
import java.util.List;
 
import com.trivia.spring.model.Player;
 
public interface PlayerService {
 
    void savePlayer(Player player);
 
    List<Player> findAllPlayers();
 
    void deletePlayerById(String id);
 
    Player findById(String id);
 
    void updatePlayer(Player player);
}