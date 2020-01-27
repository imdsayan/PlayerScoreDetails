package com.crickInfo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crickInfo.model.Player;
import com.crickInfo.repository.PlayerRepo;
import com.crickInfo.service.PlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {
	
	public static final Logger logger=LoggerFactory.getLogger(PlayerController.class);
	
	@Autowired
	private PlayerService playerService;
	
	@GetMapping(value="/all")
	public List<Player> getAllPlayers(){
		
		List<Player> allPlayerList = playerService.getAllPlayers();
		return allPlayerList;
		
	}
	
	@PostMapping(value="/addPlayer")
	public Player addNewPlayer(@RequestBody final Player player) {
		
		Player newPlayer = playerService.addPlayer(player);
		
		return newPlayer;
		
	}
	
	@GetMapping(value="/{id}")
	public Player getPlayerById(@PathVariable("id") final Integer id) {
		
		logger.info("Searching for the player with id :"+ id);
		
		
		Player player = playerService.getPlayerById(id);
		if(player!=null) {
			logger.info("The player info with id :"+id+" is :- "+player);
			return player;
			}
		else {
			logger.error("The player with given id doesn't exist");
			
		}
		
		return player;
	}
	

}
