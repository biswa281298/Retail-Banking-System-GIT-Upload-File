package com.cognizant.customerservice.model;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerEntity {
	@Id
	@Column(name = "userid", length = 20,unique=true)
	@Size(min=5,max=20,message="Length should be 5 and 20 ")
	private String userid;
	
	@Column(name = "username", length = 20)
	@NotBlank(message="could not be blank")
	@Pattern(regexp ="^[A-Za-z ]{3,20}$",message="Length should be 10 & 20  and contains alphabet")
	private String username;
	
	@Column(name = "password")
	@NotBlank(message="could not be blank")
	@Pattern(regexp =".{8,15}",message="Length should be 8 and 15 ")
	private String password;
	
	@Column(name = "dateOfBirth")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dateOfBirth; 
	
	@Column(name = "pan", length = 10)
	@NotBlank(message="could not be blank")
	@Pattern(regexp ="^[A-Z0-9]{10}$",message="Length should be 10 and contains Capital alphabet and digit")
	private String pan;
	
	@Column(name = "address")
	@NotBlank(message="could not be blank")
	@Pattern(regexp ="^[A-Z0-9a-z/\\-\\.,' ]{5,30}$",message="Length should be between 10 & 30 and contains alphabet , digit and /-.,' ")
	private String address;
	

	@Transient
	private List<Account> accounts = new ArrayList<>();
	
	
	
}
