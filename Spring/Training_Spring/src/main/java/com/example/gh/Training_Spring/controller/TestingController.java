package com.example.gh.Training_Spring.controller;

import com.example.gh.Training_Spring.model.Player;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
// http://localhost:8080/api
public class TestingController {

    @Value("${gh.name}")
    public String name;

    @GetMapping("/name")
    // http://localhost:8080/api/name
    public String getName(){
        return "i am "+name;
    }


    @GetMapping("/players")
    // http://localhost:8080/api/players
    public List<Player> getPlayers(){
        List<Player> players=  new ArrayList<>();
        Player player1= new Player(1,"ghaida","tartous",25);
        Player player2= new Player(2,"sara","homs",21);
        Player player3= new Player(3,"ali","tartous",27);
        Player player4= new Player(4,"nour","tartous",25);
        Player player5= new Player(5,"mariam","hama",19);
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        return players;
    }
}
