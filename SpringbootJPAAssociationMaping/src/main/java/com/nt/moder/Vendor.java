package com.nt.moder;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Vendor {
	@Id
	private Integer vid;
	
	private String vname;
	
	@OneToMany
	@JoinColumn(name="vfk")
	private List<Contract> cob;

}
