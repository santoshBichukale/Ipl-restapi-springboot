package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.PlayerDao;
import com.tka.modal.Player;

@Service
public class PlayerSrevice {

	@Autowired
	PlayerDao playerDao;

	public Player addNewPlayer(Player player) {
		return playerDao.addNewPlayer(player);

	}

	public List<Player> getAllPlayers() {

		return playerDao.getAllPlayers();
	}

	public Player getPlayerByID(int id) {

		return playerDao.getPlayerByID(id);
	}

	public void updatePlayer(int id, Player updatedplayer) {
		playerDao.updatePlayer(id,updatedplayer);
	}

	public void deletePlayer(int id) {
		
		playerDao.deletePlayer(id);
	}

}
