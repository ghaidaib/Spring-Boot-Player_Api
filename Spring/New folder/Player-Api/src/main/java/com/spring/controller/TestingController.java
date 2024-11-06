package com.spring.controller;


import com.spring.model.Player;
import com.spring.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// http://localhost:8080/
@Controller
@RequestMapping("")
public class TestingController {

        private PlayerService playerService;

    @Autowired
    public TestingController(PlayerService playerService) {
        this.playerService = playerService;
   }


        // http://localhost:8080/profile
    @GetMapping("/profile")
    public String get(){
        return "home";
    }



        // http://localhost:8080/players
        @GetMapping("/players")
    public String getPlayers(Model model){
        model.addAttribute("players",playerService.getPlayers());
        return "home";
    }


        // http://localhost:8080/player-form
        @GetMapping("/player-form")
        public String playerForm(Model model){
        model.addAttribute("player",new Player());
         return "player-form";
        }

        // http://localhost:8080/save-player
        @PostMapping("/save-player")
        public String save(@ModelAttribute("player")Player player){
              playerService.createPlayer(player);
              return "redirect:/players";
        }

        // http://localhost:8080/get-player
        @GetMapping("/get-player")
        public String get(@RequestParam("playerId")int id,Model model){
        model.addAttribute("player", playerService.getPlayer(id));
            return "/player-form";
        }
    // http://localhost:8080/remove-player
    @GetMapping("/remove-player")
    public String remove(@RequestParam("playerId")int id){
        playerService.deletePlayer(id);
        return "redirect:/players";
    }
}

