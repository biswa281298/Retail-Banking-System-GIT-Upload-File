package com.cognizant.accountservice.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ACCOUNT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account {

	/**
	 *  Account Entity used in Repository
	 */
	@Id
	@Column(unique=true)
	@NotNull(message = "Enter Account number")
	@DecimalMax(value="9999999999",message="Length should be 10 and digit")
	@DecimalMin(value="1000000000",message="Length should be 10 and digit")
	private long accountId;
	
	@NotBlank(message = "Enter customerId")
	private String customerId;

	@NotNull(message = "Enter currentBalance")
	@DecimalMin(value="1000",message="Opening balance should be 1000")
	private double currentBalance;

	@NotBlank(message = "Enter accountType")
	private String accountType;

	@Column(length = 20)
	@NotBlank(message = "Enter ownerName")
	private String ownerName;

	@Transient
	private List<Transaction> transactions;

}