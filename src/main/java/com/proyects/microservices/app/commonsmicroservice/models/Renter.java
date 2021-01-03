package com.proyects.microservices.app.commonsmicroservice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "renters")
public class Renter extends Person {

	private static final long serialVersionUID = 1L;
	
	@Column
	private Double score;
	
	@Column
	private String personalDescription;
	
	@Column
	private boolean pets;
	
	@Column
	private boolean balconyPrefered;
	
	@Column
	private boolean backyardPrefered;
	
	@Column
	private boolean partiesPrefered;
	
	@Column
	private boolean smoker;
	
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public String getPersonalDescription() {
		return personalDescription;
	}
	public void setPersonalDescription(String personalDescription) {
		this.personalDescription = personalDescription;
	}
	public boolean isPets() {
		return pets;
	}
	public void setPets(boolean pets) {
		this.pets = pets;
	}
	public boolean isBalconyPrefered() {
		return balconyPrefered;
	}
	public void setBalconyPrefered(boolean balconyPrefered) {
		this.balconyPrefered = balconyPrefered;
	}
	public boolean isBackyardPrefered() {
		return backyardPrefered;
	}
	public void setBackyardPrefered(boolean backyardPrefered) {
		this.backyardPrefered = backyardPrefered;
	}
	public boolean isPartiesPrefered() {
		return partiesPrefered;
	}
	public void setPartiesPrefered(boolean partiesPrefered) {
		this.partiesPrefered = partiesPrefered;
	}
	public boolean isSmoker() {
		return smoker;
	}
	public void setSmoker(boolean smoker) {
		this.smoker = smoker;
	}
	
}
