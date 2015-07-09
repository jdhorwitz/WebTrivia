package com.jhorwitz.trivia.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.jhorwitz.trivia.dao.PlayerDao;
import com.jhorwitz.trivia.model.Player;
 
@Service("playerService")
@Transactional
public class PlayerServiceImpl implements PlayerService{
 
    @Autowired
    private PlayerDao dao;
     
    public void savePlayer(Player player) {
        dao.savePlayer(player);
    }
 
    public List<Player> findAllPlayers() {
        return dao.findAllPlayers();
    }
 
    public void deletePlayerById(String id) {
        dao.deletePlayerById(id);
    }
 
    public Player findById(String id) {
        return dao.findById(id);
    }
 
    public void updatePlayer(Player player){
        dao.updatePlayer(player);
    }
}
