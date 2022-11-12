package com.example.booking.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.FutureOrPresent;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@NoArgsConstructor
@ToString
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer bookingId;
	@OneToOne
	private Member member;
	@OneToOne
	private Facility facility;
	private BookingStatus status;
	@FutureOrPresent
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fromDate;
	@FutureOrPresent
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date toDate;
	private String comments;
	public Booking(Integer bookingId, Member member, Facility facility, BookingStatus status, Date fromDate,
			Date toDate, String comments) {
		super();
		this.bookingId = bookingId;
		this.member = member;
		this.facility = facility;
		this.status = status;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.comments = comments;
	}
	public Booking(Member member, Facility facility, BookingStatus status, Date fromDate, Date toDate,
			String comments) {
		super();
		this.member = member;
		this.facility = facility;
		this.status = status;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.comments = comments;
	}
	
}
