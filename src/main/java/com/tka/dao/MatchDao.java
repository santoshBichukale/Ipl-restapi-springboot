package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tka.modal.Match;

@Repository
public class MatchDao {
	List<Match> matchesList = new ArrayList<>();

	public Match addNewMatch(Match match) {
		matchesList.add(match);
		return match;
	}

	public List<Match> getAllMatches() {
		return matchesList;
	}

	public Match getMatchByID(int id) {
		return matchesList.stream().filter(match -> match.getMatchId() == id).findFirst().orElse(null); 
	}

	public void updateMatch(int id, Match updatedMatch) {
		for (int i = 0; i < matchesList.size(); i++) {
			if (matchesList.get(i).getMatchId() == id) {
				matchesList.set(i, updatedMatch);
				return;
			}
		}
		throw new IllegalArgumentException("Match ID not found: " + id);
	}

	public void deleteMatch(int id) {
		matchesList.removeIf(match -> match.getMatchId() == id);
	}

}
