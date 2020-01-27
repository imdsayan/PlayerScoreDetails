package com.crickInfo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="player_scores")
public class PlayerScore {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "player_id")
	private Player player ;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "match_id")
	private Match match;
	
	private int score;
	
	
	public PlayerScore() {
		
	}


	public PlayerScore(Player player, Match match, int score) {
		this.player = player;
		this.match = match;
		this.score = score;
	}


	public Player getPlayer() {
		return player;
	}


	public void setPlayer(Player player) {
		this.player = player;
	}


	public Match getMatch() {
		return match;
	}


	public void setMatch(Match match) {
		this.match = match;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}
	
	
}
