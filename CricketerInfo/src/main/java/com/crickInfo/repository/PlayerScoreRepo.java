package com.crickInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.crickInfo.model.PlayerScore;

@Component
public interface PlayerScoreRepo extends JpaRepository<PlayerScore, Integer>{

}
