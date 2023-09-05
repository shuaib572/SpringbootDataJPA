package com.nt.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	private Integer id;
	private String name;
	@Lob
	private byte[] img;
	@Lob
	private char[]data;
	@Temporal(TemporalType.DATE)
	private Date datea;
	@Temporal(TemporalType.TIME)
	private Date dateb;
	@Temporal(TemporalType.TIMESTAMP)
	private Date datrec;
	
}
