package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tka.modal.Player;

@Repository
public class PlayerDao {
	
	List<Player> playerlist=new ArrayList<Player>();
	/*
	 * public PlayerDao() { playerlist.add(new Player(1, "Rohit", 23,
	 * "mumbai Indians", "Batsman")); }
	 */

	public Player addNewPlayer(Player player ) {
		playerlist.add(player);
		return player;
	}

	public List<Player> getAllPlayers() {
		
		return playerlist;
	}

	public Player getPlayerByID(int id) {
		for (Player player : playerlist) {
			if(player.getPlayerId()==id) {
				return player;
			}
			
		
	}
		return null;

	
	
	}

	public void updatePlayer(int id, Player updatedplayer) {
		for (int i = 0; i < playerlist.size() ; i++) {
			Player player =playerlist.get(i);
			if(player.getPlayerId()==id) {
				
				playerlist.set(i, updatedplayer);
				
			}
		}
		
	}

	public void deletePlayer(int id) {
		
		for (int i = 0; i < playerlist.size() ; i++) {
			Player player =playerlist.get(i);
			if(player.getPlayerId()==id) {
				
				playerlist.remove(player);
				
			}
		}
	}
}
