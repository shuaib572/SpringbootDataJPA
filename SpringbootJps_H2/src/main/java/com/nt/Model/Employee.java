package com.nt.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name="etmtab")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	@Column(name="id")
	Integer Empid;
	@Column(name="ename")
	String Empname;
	@Column(name="esal")
	Double Empsal;

}
