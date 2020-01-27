package com.crickInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.crickInfo.model.Match;

@Component
public interface MatchRepo extends JpaRepository<Match, Integer>{

}
