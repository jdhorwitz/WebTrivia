package com.jhorwitz.trivia.dao;


import com.jhorwitz.trivia.model.Player;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Repository("PlayerDao")
public class PlayerDaoImpl extends AbstractDao implements PlayerDao {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("trivia");
    EntityManager em = entityManagerFactory.createEntityManager();
    EntityTransaction userTransaction = em.getTransaction();

    @Override
    public void savePlayer(Player player) {

    }

    @Override
    public List<Player> findAllPlayers() {
        TypedQuery<Player> query = em.createQuery("", Player.class);
        List<Player> list = query.getResultList();
        Player p = new Player();
        for (int i = 0; i < list.size(); i++) {
            p = list.get(i);
        }
        return (List<Player>) p;
    }

    @Override
    public void deletePlayer(String id) {

    }


    public void createPlayer(long id, String name, int score, String team, String username) {
        userTransaction.begin();
        Player player = new Player();
        player.setId(id);
        player.setName(name);
        player.setScore(score);
        player.setTeam(team);
        player.setUsername(username);
        em.persist(player);
        userTransaction.commit();
    }

    public Player getPlayer(String id) {
        return null;
    }

    public void updatePlayer(Player player) {
        getSession().update(player);
    }
}
