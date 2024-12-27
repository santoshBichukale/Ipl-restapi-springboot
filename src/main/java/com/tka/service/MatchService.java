package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.MatchDao;
import com.tka.modal.Match;

@Service
public class MatchService {
	@Autowired
	MatchDao matchDao;

	

	public List<Match> getAllmatches() {
		
		return matchDao.getAllMatches();
	}

	public Match addNewMatch(Match match) {
		
		return matchDao.addNewMatch(match);
	}

	public Match getMatchByID(int id) {
		
		return matchDao.getMatchByID(id);
	}

	public void updateMatch(int id, Match updatematch) {
		matchDao.updateMatch(id,updatematch);
		
	}

	public void deletematch(int id) {
		matchDao.deleteMatch(id);
		
	}

}
