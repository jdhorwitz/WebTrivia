package com.jhorwitz.trivia.dao;


import com.jhorwitz.trivia.model.Player;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

@Repository("PlayerDao")
@Transactional
public class PlayerDaoImpl extends AbstractDao implements PlayerDao {

    @PersistenceContext
    private EntityManager em;


    public void savePlayer(Player player){
        em.persist(player);
    }

    @Override
    public List<Player> findAllPlayers() {
        return null;
    }


   /* @Override
    public List<Player> findAllPlayers() {
        TypedQuery<Player> query = em.createQuery("SELECT p FROM Player p", Player.class);
        List<Player> list = query.getResultList();
        return list;

    }*/

    @Override
    public void deletePlayer(String id) {
        Player player = em.find(Player.class, id);
        em.remove(player);
    }

    public Player getPlayer(String id) {
        Player player = em.find(Player.class, id);
        return player;
    }

    public void updatePlayer(String id, String name, int score, String team, Date date, String username) {
        Player player = em.find(Player.class, id);
        player.setName(name);
        player.setScore(score);
        player.setTeam(team);
        player.setUpdatedTime(date);
        player.setUsername(username);
    }
}
