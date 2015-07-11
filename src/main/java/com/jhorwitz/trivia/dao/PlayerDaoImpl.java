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

    public Long savePlayer(Player player){
        em.persist(player);
        return player.getId();
    }


    @Override
    public List<Player> findAllPlayers() {
        TypedQuery<Player> query = em.createQuery("SELECT p FROM Player p", Player.class);
        List<Player> list = query.getResultList();
        return list;

    }

    @Override
    public void deletePlayer(String id) {

    }


    }

    public Player getPlayer(String id) {
        return null;
    }

    public void updatePlayer(Player player) {
        getSession().update(player);
    }
}
