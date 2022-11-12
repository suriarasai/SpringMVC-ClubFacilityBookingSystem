package com.example.booking.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.booking.domain.Facility;

public interface FacilityRepo extends JpaRepository<Facility, Integer> {
	
	@Query("Select f from Facility f where f.facilityName LIKE :name")
	List<Facility> findFacilitiesByName(@Param("name") String facilityName);

}
