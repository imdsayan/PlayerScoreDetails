package com.crickInfo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.crickInfo.model.Match;
import com.crickInfo.repository.MatchRepo;

public class MatchesService {
	
	@Autowired
	private MatchRepo matchRepo;
	
	public Match getMatchDetails(Integer id) {
		
		return matchRepo.getOne(id);
		
	}

}
