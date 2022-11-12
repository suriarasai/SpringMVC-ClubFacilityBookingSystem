package com.example.booking.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Facility {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer facilityId;
	private String facilityName;
	private String description;
	public Facility(Integer facilityId, String facilityName, String description) {
		super();
		this.facilityId = facilityId;
		this.facilityName = facilityName;
		this.description = description;
	}
	public Facility(String facilityName, String description) {
		super();
		this.facilityName = facilityName;
		this.description = description;
	}
	

}
