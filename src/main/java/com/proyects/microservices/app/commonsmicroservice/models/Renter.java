package com.proyects.microservices.app.commonsmicroservice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "renters")
public class Renter extends Person {

	private static final long serialVersionUID = 1L;
		
	public Renter(Double score, String personalDescription, Boolean pets, Boolean balconyPrefered,
			Boolean backyardPrefered, Boolean partiesPrefered, Boolean smoker) {
		super();
		this.score = score;
		this.personalDescription = personalDescription;
		this.pets = pets;
		this.balconyPrefered = balconyPrefered;
		this.backyardPrefered = backyardPrefered;
		this.partiesPrefered = partiesPrefered;
		this.smoker = smoker;
	}
	
	public Renter() {
		super();
	}

	@Column
	private Double score;
	
	@Column
	private String personalDescription;
	
	@Column
	private Boolean pets;
	
	@Column
	private Boolean balconyPrefered;
	
	@Column
	private Boolean backyardPrefered;
	
	@Column
	private Boolean partiesPrefered;
	
	@Column
	private Boolean smoker;
	
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

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
	public Boolean isPets() {
		return pets;
	}
	public void setPets(Boolean pets) {
		this.pets = pets;
	}
	public Boolean isBalconyPrefered() {
		return balconyPrefered;
	}
	public void setBalconyPrefered(Boolean balconyPrefered) {
		this.balconyPrefered = balconyPrefered;
	}
	public Boolean isBackyardPrefered() {
		return backyardPrefered;
	}
	public void setBackyardPrefered(Boolean backyardPrefered) {
		this.backyardPrefered = backyardPrefered;
	}
	public Boolean isPartiesPrefered() {
		return partiesPrefered;
	}
	public void setPartiesPrefered(Boolean partiesPrefered) {
		this.partiesPrefered = partiesPrefered;
	}
	public Boolean isSmoker() {
		return smoker;
	}
	public void setSmoker(Boolean smoker) {
		this.smoker = smoker;
	}
	
}
