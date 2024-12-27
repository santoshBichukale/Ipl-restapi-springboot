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

import com.tka.modal.Match;
import com.tka.service.MatchService;

@RestController
@RequestMapping("/api")
public class MatchController {
	@Autowired
	MatchService matchService;
	
	@PostMapping("match")
	public Match addNewMatch(@RequestBody Match match ) {
		
		return matchService.addNewMatch(match);
		
	}
	
	@GetMapping("matches")
	public List<Match> getAllmatches(){
		return matchService.getAllmatches();
		
	}
	
	@GetMapping("match/{id}")
	public Object getMatchByID(@PathVariable int id) {
		Match match=matchService.getMatchByID(id);
		if(match!=null) {
			return match;
		}else {
			return "Given id not found match";
		}
		
		
	}
	
	@PutMapping("match/{id}")
    public void updateMatch(@PathVariable int id, @RequestBody Match updatematch) {
		matchService.updateMatch(id,updatematch);
	}
	@DeleteMapping("match/{id}")
    public String deleteMatch(@PathVariable int id) {
		
		matchService.deletematch(id);
		return "Delete Successfully";
    }

}
