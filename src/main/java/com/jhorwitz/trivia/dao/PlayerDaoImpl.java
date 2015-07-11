package com.jhorwitz.trivia.dao;


import com.jhorwitz.trivia.model.Player;
import org.springframework.stereotype.Repository;
import javax.persistence.*;
import javax.transaction.Transactional;
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
        TypedQuery<Player> query = em.createQuery("SELECT p FROM Player p", Player.class);
        List<Player> list = query.getResultList();
        return list;

    }

    @Override
    public void deletePlayer(String id) {
        TypedQuery<Player> p = em.createQuery("SELECT p FROM Player p Where ID:id", Player.class);
        List<Player> list = p.getResultList();
        Player player = list.get(0);
        em.remove(player);
    }




    public Player getPlayer(String id) {
        TypedQuery<Player> p = em.createQuery("SELECT p FROM Player p Where ID:id", Player.class);
        List<Player> list = p.getResultList();
        Player player = list.get(0);
        return player;
    }

    public void updatePlayer(Player player) {
        getSession().update(player);
    }
}
