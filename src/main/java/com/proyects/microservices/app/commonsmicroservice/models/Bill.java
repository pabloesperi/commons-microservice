package com.proyects.microservices.app.commonsmicroservice.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bills")
public class Bill implements Serializable {

	private static final long serialVersionUID = -8093693762563443847L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "billNumber")
	private Long billNumber;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(name = "bills_to_persons", joinColumns = @JoinColumn(name="bills_id"), inverseJoinColumns = @JoinColumn(name="persons_id"))
	private Person person;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "products_to_bills", joinColumns = @JoinColumn(name="bills_id"), inverseJoinColumns = @JoinColumn(name="products_id"))
	private List <Product> products;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(Long billNumber) {
		this.billNumber = billNumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
