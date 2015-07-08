package com.trivia.spring.dao;
 
import java.util.List;
 
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
 
import com.trivia.spring.model.Player;
 
@Repository("PlayerDao")
public class PlayerDaoImpl extends AbstractDao implements PlayerDao{
 
    public void savePlayer(Player player) {
        persist(player);
    }
 
    @SuppressWarnings("unchecked")
    public List<Player> findAllPlayers() {
        Criteria criteria = getSession().createCriteria(Player.class);
        return (List<Player>) criteria.list();
    }
 
    public void deletePlayerById(String id) {
        Query query = getSession().createSQLQuery("delete from Player where Id = :id");
        query.setString("Id", id);
        query.executeUpdate();
    }
 
     
    public Player findById(String id){
        Criteria criteria = getSession().createCriteria(Player.class);
        criteria.add(Restrictions.eq("Id",id));
        return (Player) criteria.uniqueResult();
    }
     
    public void updatePlayer(Player player){
        getSession().update(player);
    }
     
}