package com.proyects.microservices.app.commonsmicroservice.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
public class Property implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String size;
	
	@Column
	private Integer room;
	
	@Column
	private Integer bathroom;
	
	@Column
	private Integer yearOfConstruction;
	
	@Column
	private String heatingType;
	
	@Column
	private Boolean airConditioner;
	
	@Column
	private String actualState;
	
	@Column
	private Double price;
	
	@Column
	private String operation;
	
	@Column
	private Boolean pets;
	
	@Column
	private Boolean balcony;
	
	@Column
	private Boolean backyard;
	
	@Column
	private Boolean parties;
	
	@Column
	private Boolean smokers;
	
	@Column
	private Double deposit;
	
	@Column
	private String warranties;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private List<WhishList> whishList;

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

	public Integer getRoom() {
		return room;
	}

	public void setRoom(Integer room) {
		this.room = room;
	}

	public Integer getBathroom() {
		return bathroom;
	}

	public void setBathroom(Integer bathroom) {
		this.bathroom = bathroom;
	}

	public Integer getYearOfConstruction() {
		return yearOfConstruction;
	}

	public void setYearOfConstruction(Integer yearOfConstruction) {
		this.yearOfConstruction = yearOfConstruction;
	}

	public String getHeatingType() {
		return heatingType;
	}

	public void setHeatingType(String heatingType) {
		this.heatingType = heatingType;
	}

	public Boolean isAirConditioner() {
		return airConditioner;
	}

	public void setAirConditioner(Boolean airConditioner) {
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

	public Boolean isPets() {
		return pets;
	}

	public void setPets(Boolean pets) {
		this.pets = pets;
	}

	public Boolean isBalcony() {
		return balcony;
	}

	public void setBalcony(Boolean balcony) {
		this.balcony = balcony;
	}

	public Boolean isBackyard() {
		return backyard;
	}

	public void setBackyard(Boolean backyard) {
		this.backyard = backyard;
	}

	public Boolean isParties() {
		return parties;
	}

	public void setParties(Boolean parties) {
		this.parties = parties;
	}

	public Boolean isSmokers() {
		return smokers;
	}

	public void setSmokers(Boolean smokers) {
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

	public List<WhishList> getWhishList() {
		return whishList;
	}

	public void setWhishList(List<WhishList> whishList) {
		this.whishList = whishList;
	}
}
