package com.proyects.microservices.app.commonsmicroservice.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import com.proyects.microservices.app.commonsmicroservice.constants.PropertiesConstantsEnum;

//@Getter
//@Setter
@Entity
@Table(name = "people")
public class Person implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "dtype",insertable = false, updatable = false)
	private String dtype;

	@NotBlank //no null, no vacío y no tiene que ser un espacio en blanco.
	@Column(name = "name")
	private String name;

	@NotEmpty
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "street")
	private String streetAddress;
	
	@Column(name = "address_line2")
	private String addressLine2;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state_province_region")
	private String stateProvinceRegion;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "postal_zip_code")
	private Integer postalZipCode;

	@NotNull //no null
	@Column(name = "date_of_birth")
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	@NotNull //ni null ni vacío. IMPORTANTE: para Integers NO se usa @NotEmpty. Sólo para Strings.
	@Column(name = "dni", unique = true)
	private Integer dni;
	
	@Column(name = "sex")
	private String sex;
	
	@Column(name = "mobile_number")
	private Integer mobileNumber;
	
	@Column(name = "age")
	private Integer age;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "person")
	private List <Bill> bill;	
	
	@OneToMany(mappedBy = "person",fetch = FetchType.LAZY)
	private List<WhishList> whishlist;

	@CreationTimestamp //esta anotación es para crear automáticamente la fecha de creación del bean en base de datos.
	@Column(unique = true)
	private LocalDateTime createdDate;

	@UpdateTimestamp//esta anotación es para actualizar automáticamente la fecha de creación del bean en base de datos.
	private LocalDateTime updatedDate;

	//@Version  comienza en cero. Cambia con cada modificación de la entidad.
//	private Long version;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateProvinceRegion() {
		return stateProvinceRegion;
	}
	public void setStateProvinceRegion(String stateProvinceRegion) {
		this.stateProvinceRegion = stateProvinceRegion;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPostalZipCode() {
		return postalZipCode;
	}
	public void setPostalZipCode(Integer postalZipCode) {
		this.postalZipCode = postalZipCode;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Integer getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public List<Bill> getBill() {
		return bill;
	}
	public void setBill(List<Bill> bill) {
		this.bill = bill;
	}
	public String getDtype() {
		return dtype;
	}
	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	public List<WhishList> getWhishlist() {
		return whishlist;
	}
	public void setWhishlist(List<WhishList> whishlist) {
		this.whishlist = whishlist;
	}

}
