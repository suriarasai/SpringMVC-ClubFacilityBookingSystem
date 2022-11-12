package com.example.booking.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.booking.domain.Member;


public interface MemberRepo extends JpaRepository<Member, Integer> {
	
	@Query("Select m from Member m where m.firstName LIKE :fName")
	List<Member> findMembersByFirstName(@Param("fName") String firstName);

	@Query("Select m from Member m where m.lastName LIKE :lName")
	List<Member> findMembersByLastName(@Param("lName") String lastName);
	
	@Query("Select m from Member m where m.username LIKE :uname")
	List<Member> findMembersByUsername(@Param("uname") String username);
	
}
