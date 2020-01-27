package com.crickInfo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="players")
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="player_id")
	private Integer pId;
	
	
	private String pName;
	
	private String cricketTeam;
	
	@JsonIgnore
	@OneToMany(mappedBy = "player",cascade = CascadeType.ALL)
	private List<PlayerScore> playerScore;

	
	@JsonInclude
	@Transient
	private int totalScore;
    
    @JsonInclude
    @Transient
    private List<Match> matches;
	
	

	

	public Player(String pName, String cricketTeam) {
		this.pName = pName;
		this.cricketTeam = cricketTeam;
	}
	
	public Player() {
		
	}

	
	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getCricketTeam() {
		return cricketTeam;
	}

	public void setCricketTeam(String cricketTeam) {
		this.cricketTeam = cricketTeam;
	}
	
	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	public List<Match> getMatches() {
		return matches;
	}

	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}
	
	 public List<PlayerScore> getPlayerScore() {
			return playerScore;
		}

	@Override
	public String toString() {
		return "Player [pId=" + pId + ", pName=" + pName + ", cricketTeam=" + cricketTeam + ", playerScore="
				+ playerScore + ", totalScore=" + totalScore + ", matches=" + matches + "]";
	}
	 
	 
}
