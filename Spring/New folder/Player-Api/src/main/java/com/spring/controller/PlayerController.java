package com.spring.controller;

import com.spring.model.Player;
import com.spring.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/api")
// http://localhost:8080/api
public class PlayerController {

//    private PlayerService playerService;
//
//    @Autowired
//    public PlayerController(PlayerService playerService) {
//        this.playerService = playerService;
//    }
//
//    @GetMapping("/players")
//    // http://localhost:8080/api/players
//    public List<Player> getPlayers(){
//        return playerService.getPlayers();
//    }
//
//    @GetMapping("/player")
//    // http://localhost:8080/api/player
//    public Player getPlayer(@RequestParam int id){
//        return playerService.getPlayer(id);
//    }
//  /*  @PutMapping("/update_player")
//    // http://localhost:8080/api/update_player
//    public Player updatePlayer(@RequestBody Player player){
//        return playerService.updatePlayer(player);
//    }
//   */
//  @PutMapping("/update_player")
//  // http://localhost:8080/api/update_player
//  public Player updatePlayer(@RequestParam int id,
//                             @RequestParam String name ,
//                             @RequestParam int number,
//                             @RequestParam String address ,
//                             @RequestParam String phone){
//
//      return playerService.updatePlayer(id,name ,number, address ,phone);
//  }
//
//    @PostMapping("/create_player")
//    // http://localhost:8080/api/create_player
//    public Player createPlayer(@RequestParam String name ,
//                               @RequestParam int number,
//                               @RequestParam String address ,
//                               @RequestParam String phone){
//
//        return playerService.createPlayer(name ,number, address ,phone);
//    }
//
//    @GetMapping("/delete_player")
//    // http://localhost:8080/api/delete_player
//    public void deletePlayer(@RequestParam int id){
//      playerService.deletePlayer(id);
//    }
}
