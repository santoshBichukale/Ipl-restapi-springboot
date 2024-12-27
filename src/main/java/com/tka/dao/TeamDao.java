package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tka.modal.Team;

@Repository
public class TeamDao {
	
	private static List<Team> teamList = new ArrayList<>();
	private static int currentId = 1;

	
	public Team addTeam(Team team) {
		team.setTeamId(currentId++);
		teamList.add(team);
		return team;

	}

	public List<Team> getAllTeams() {

		return teamList;
	}

	 public Team getTeamById(int id) { 
	        for (Team team : teamList) {
	            if (team.getTeamId() == id) {
	                return team; 
	            }
	        }
	        return null; 
	    }
	 
	 public Object updateTeam(Team updatedTeam, int id) {
			for (int i = 0; i < teamList.size(); i++) {
				Team team = teamList.get(i);
				if (team.getTeamId() == updatedTeam.getTeamId()) {
					
					teamList.set(i, updatedTeam);
					return "Updated Successfully"; 
				}
			}
			return "Team not found";
		}
	 
	 public int deleteTeamById(int id) {
			for (int i = 0; i < teamList.size(); i++) {
				Team team = teamList.get(i);
				if (team.getTeamId() == id) {
					
					teamList.remove(i);
					
					return 1;
				}
			}
			return 0;
			
		}
}
