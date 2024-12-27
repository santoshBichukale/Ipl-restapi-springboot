package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.TeamDao;
import com.tka.modal.Team;

@Service
public class TeamService {
	
	
	@Autowired
	TeamDao teamDao;

	public Team addTeam(Team team) {
		
		return teamDao.addTeam(team);
	}
	

	public List<Team> getAllTeams() {
		
		return teamDao.getAllTeams();
	}

	
	public Team getTeamById(int id) {
		
		return teamDao.getTeamById(id);
	}


	public Object updateTeam(Team updatedTeam, int id) {
		 
		return teamDao.updateTeam(updatedTeam,id);
		
	}


	public String deleteTeamById(int id) {
		int status= teamDao.deleteTeamById(id);
		if(status==0) {
			return "Team not found";
		}else {
		return "Team deleted";
		
		}
		
	}

}
