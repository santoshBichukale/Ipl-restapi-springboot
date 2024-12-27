package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.tka.modal.Player;
import com.tka.modal.Team;
import com.tka.service.PlayerSrevice;

@RestController
@RequestMapping("/api")
public class PlayerController {
	
	@Autowired
	PlayerSrevice playerSrevice;
	
	@PostMapping("player")
	public Player addNewPlayer(@RequestBody Player player ) {
		
		return playerSrevice.addNewPlayer(player);
		
	}
	
	@GetMapping("players")
	public List<Player> getAllPlayers(){
		return playerSrevice.getAllPlayers();
		
	}
	
	@GetMapping("player/{id}")
	public Object getPlayerByID(@PathVariable int id) {
	 Player player=playerSrevice.getPlayerByID(id);
		if(player!=null) {
			return player;
		}else {
			return "Given id not found team";
		}
		
		
	}
	
	@PutMapping("player/{id}")
    public void updatePlayer(@PathVariable int id, @RequestBody Player updatedplayer) {
		playerSrevice.updatePlayer(id,updatedplayer);
	}
	@DeleteMapping("player/{id}")
    public String deletePlayer(@PathVariable int id) {
		
		playerSrevice.deletePlayer(id);
		return "Delete Successfully";
    }

}
