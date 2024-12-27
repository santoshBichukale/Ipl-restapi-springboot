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

import com.tka.modal.Team;
import com.tka.service.TeamService;

@RestController
@RequestMapping("/api")
public class TeamController {

	@Autowired
	TeamService teamService;

	@PostMapping("teams")
	Team team(@RequestBody Team team) {
		return teamService.addTeam(team);

	}

	@GetMapping("teams")
	List<Team> getAllTeams() {

		return teamService.getAllTeams();

	}
	
	@GetMapping("{id}")
	Team getTeamById(@PathVariable("id") int id) {
	    return teamService.getTeamById(id);
	}

	

	@PutMapping("{id}")
    public Object updateTeam(@PathVariable int id, @RequestBody Team updatedTeam) {
        
        return teamService.updateTeam(updatedTeam,id);
    }
	
	  @DeleteMapping("{id}")
	    public void deleteTeam(@PathVariable int id) {
	        teamService.deleteTeamById(id);
	    }
	
}
