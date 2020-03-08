package com.adp.prokabaddi.entity.model;

import com.adp.prokabaddi.entity.inter.model.RequestModel;
import com.adp.prokabaddi.entity.inter.model.ResponseModel;
import lombok.Data;

/**
 *  Team details.  
 */
@Data
public class Team implements RequestModel,ResponseModel
{
  private static final long serialVersionUID = 1L; 
  private long id;
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
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the description
 */
public String getDescription() {
	return description;
}
/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @return the serialversionuid
 */
public static long getSerialversionuid() {
	return serialVersionUID;
}
private String name;
  private String description;
  private String city;

}
