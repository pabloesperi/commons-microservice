package com.proyects.microservices.app.commonsmicroservice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Property {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String size;
	
	@Column
	private int room;
	
	@Column
	private int bathroom;
	
	@Column
	private int yearOfConstruction;
	
	@Column
	private String heatingType;
	
	@Column
	private boolean airConditioner;
	
	@Column
	private String actualState;
	
	@Column
	private Double price;
	
	@Column
	private String operation;
	
	@Column
	private boolean pets;
	
	@Column
	private boolean balcony;
	
	@Column
	private boolean backyard;
	
	@Column
	private boolean parties;
	
	@Column
	private boolean smokers;
	
	@Column
	private Double deposit;
	
	@Column
	private String warranties;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public int getBathroom() {
		return bathroom;
	}

	public void setBathroom(int bathroom) {
		this.bathroom = bathroom;
	}

	public int getYearOfConstruction() {
		return yearOfConstruction;
	}

	public void setYearOfConstruction(int yearOfConstruction) {
		this.yearOfConstruction = yearOfConstruction;
	}

	public String getHeatingType() {
		return heatingType;
	}

	public void setHeatingType(String heatingType) {
		this.heatingType = heatingType;
	}

	public boolean isAirConditioner() {
		return airConditioner;
	}

	public void setAirConditioner(boolean airConditioner) {
		this.airConditioner = airConditioner;
	}

	public String getActualState() {
		return actualState;
	}

	public void setActualState(String actualState) {
		this.actualState = actualState;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public boolean isPets() {
		return pets;
	}

	public void setPets(boolean pets) {
		this.pets = pets;
	}

	public boolean isBalcony() {
		return balcony;
	}

	public void setBalcony(boolean balcony) {
		this.balcony = balcony;
	}

	public boolean isBackyard() {
		return backyard;
	}

	public void setBackyard(boolean backyard) {
		this.backyard = backyard;
	}

	public boolean isParties() {
		return parties;
	}

	public void setParties(boolean parties) {
		this.parties = parties;
	}

	public boolean isSmokers() {
		return smokers;
	}

	public void setSmokers(boolean smokers) {
		this.smokers = smokers;
	}

	public Double getDeposit() {
		return deposit;
	}

	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}

	public String getWarranties() {
		return warranties;
	}

	public void setWarranties(String warranties) {
		this.warranties = warranties;
	}

}
