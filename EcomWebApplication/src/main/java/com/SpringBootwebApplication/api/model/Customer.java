package com.SpringBootwebApplication.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="customer")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Customer {
	
	@Id
	@GeneratedValue
	private int cno; 
	private String cname;
	private String caddr;

}
