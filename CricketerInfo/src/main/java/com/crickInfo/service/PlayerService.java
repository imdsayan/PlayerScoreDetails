package com.crickInfo.service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.crickInfo.exceptions.PlayerIdNotFoundException;
import com.crickInfo.model.Match;
import com.crickInfo.model.Player;
import com.crickInfo.model.PlayerScore;
import com.crickInfo.repository.PlayerRepo;

@Component
public class PlayerService {
	
	@Autowired
	PlayerRepo playerRepo;
	
	
    //	to fetch all player details
	public List<Player> getAllPlayers(){
		
	  return playerRepo.findAll();
	}
	
	public Player getPlayerById(Integer id) {
			int totalScore=0;
		 	List<Match> matchesDetails = new ArrayList<Match>();
		 	
			Player player =	playerRepo.findById(id).orElseThrow(()->new PlayerIdNotFoundException(id));
			
			for(PlayerScore ps: player.getPlayerScore()) {
				totalScore=totalScore+ps.getScore();
				matchesDetails.add(ps.getMatch());
				
			}
			player.setTotalScore(totalScore);
			player.setMatches(matchesDetails);
			return player;
		}
	
	
	public Player addPlayer(Player playerObj) {
		playerRepo.save(playerObj);
		
		return playerObj;
	}
	

}
