package com.qa.hobbyproject.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class SneakerDom {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)	
	 //attributes of sneaker data
	public Integer id;
	
@Column(nullable=false)
	public String name;
	
@Column(nullable=false)
	public String collectionName;
	
@Column(nullable=false)
	public Integer size;
	
@Column(nullable=false)
	public Boolean ownedCheck;
	
@Column(nullable=false)
	public Integer condition;
	
@Column(nullable=false)
	public String colour1;
	
@Column(nullable=false)
	public String colour2;
	
@Column(nullable=false)
	public String material;

	public SneakerDom(Integer id, String name, String collectionName, Integer size, Boolean ownedCheck,
			Integer condition, String colour1, String colour2, String material) {
		super();
		this.id = id;
		this.name = name;
		this.collectionName = collectionName;
		this.size = size;
		this.ownedCheck = ownedCheck;
		this.condition = condition;
		this.colour1 = colour1;
		this.colour2 = colour2;
		this.material = material;
	}
	
	public SneakerDom() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollectionName() {
		return collectionName;
	}

	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Boolean getOwnedCheck() {
		return ownedCheck;
	}

	public void setOwnedCheck(Boolean ownedCheck) {
		this.ownedCheck = ownedCheck;
	}

	public Integer getCondition() {
		return condition;
	}

	public void setCondition(Integer condition) {
		this.condition = condition;
	}

	public String getColour1() {
		return colour1;
	}

	public void setColour1(String colour1) {
		this.colour1 = colour1;
	}

	public String getColour2() {
		return colour2;
	}

	public void setColour2(String colour2) {
		this.colour2 = colour2;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "SneakerDom [id=" + id + ", name=" + name + ", collectionName=" + collectionName + ", size=" + size
				+ ", ownedCheck=" + ownedCheck + ", condition=" + condition + ", colour1=" + colour1 + ", colour2="
				+ colour2 + ", material=" + material + "]";
	}
	
	
	

}
