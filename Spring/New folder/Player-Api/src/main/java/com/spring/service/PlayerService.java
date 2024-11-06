package com.spring.service;

import com.spring.dao.PlayerDao;
import com.spring.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class PlayerService {
    private PlayerDao playerDao;


    @Autowired
    public PlayerService(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    public List<Player> getPlayers(){
        return playerDao.findAll();
    }

    public Player getPlayer(int id){
        return playerDao.findById(id).get();
    }

    public Player updatePlayer(int id,String name ,
                               int number, String address ,
                              String phone){
        Player player = new Player(id,name,address,number,phone);
        return playerDao.save(player);
    }

//    public Player createPlayer(String name ,
//                               int number, String address ,
//                               String phone){
//        Player player = new Player();
//        player.setName(name);
//        player.setAddress(address);
//        player.setNumber(number);
//        player.setPhone(phone);
//        return playerDao.save(player);
//    }
public Player createPlayer(Player player){
    return playerDao.save(player);
}
     public void deletePlayer(int id){
        playerDao.deleteById(id);
     }

}
