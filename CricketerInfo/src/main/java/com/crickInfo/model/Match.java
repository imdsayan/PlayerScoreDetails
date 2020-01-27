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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="matches")
public class Match {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="match_id")
	private Integer mId;
	
	private String seriesName;
	
	private String location;
	
//	@OneToMany
////	@JoinTable(name = "player_match", joinColumns = @JoinColumn(name = "player_id"), 
////		       inverseJoinColumns = @JoinColumn(name = "match_id"))
//	private PlayerScore player;

	public Match() {
		
	}
	
	public Match(String seriesName, String location) {
		
		this.seriesName = seriesName;
		this.location = location;
		
		
	}

	public Integer getmId() {
		return mId;
	}

	public void setmId(Integer mId) {
		this.mId = mId;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
}
