package com.adp.prokabaddi.entity.model;

import java.time.LocalDateTime;

import com.adp.prokabaddi.entity.inter.model.ResponseModel;

import lombok.Data;

/**
 *  Match Details
 */
@Data
public class Match implements ResponseModel
{
  
  private static final long serialVersionUID = 1004193081628327382L;
  /**
 * @return the id
 */
public long getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(long id) {
	this.id = id;
}

/**
 * @return the homeTeamId
 */
public long getHomeTeamId() {
	return homeTeamId;
}

/**
 * @param homeTeamId the homeTeamId to set
 */
public void setHomeTeamId(long homeTeamId) {
	this.homeTeamId = homeTeamId;
}

/**
 * @return the awayTeamId
 */
public long getAwayTeamId() {
	return awayTeamId;
}

/**
 * @param awayTeamId the awayTeamId to set
 */
public void setAwayTeamId(long awayTeamId) {
	this.awayTeamId = awayTeamId;
}

/**
 * @return the matchDate
 */
public LocalDateTime getMatchDate() {
	return matchDate;
}

/**
 * @param matchDate the matchDate to set
 */
public void setMatchDate(LocalDateTime matchDate) {
	this.matchDate = matchDate;
}

/**
 * @return the location
 */
public String getLocation() {
	return location;
}

/**
 * @param location the location to set
 */
public void setLocation(String location) {
	this.location = location;
}

/**
 * @return the serialversionuid
 */
public static long getSerialversionuid() {
	return serialVersionUID;
}

private long id;
  private long homeTeamId;
  private long awayTeamId;
  private LocalDateTime matchDate;
  private String location;
  
  /**
   *  check team relation
   *  like two matches are related based on there teams? 
   */
  public boolean isTeamMatch ( Match other )
  {
    return (other != null && other instanceof Match)
        && (this.homeTeamId == other.homeTeamId || this.homeTeamId == other.awayTeamId
            || this.awayTeamId == other.awayTeamId || this.awayTeamId == other.homeTeamId);
  }
  
}
