 package com.learnmapping.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "student_id")
	private int sId;
	
	@Column(name = "student_name")
	private String sName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addr_id")
	private Address addr;
	
	public Student(String sName, Address addr) {
		this.sName = sName;
		this.addr = addr;
	}

}
