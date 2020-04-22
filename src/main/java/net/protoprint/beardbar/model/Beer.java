package net.protoprint.beardbar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


//Lombok annotations
@Data
@NoArgsConstructor
@AllArgsConstructor

// JPA annotations
@Entity
@Table(name = "Beer")
public class Beer{


	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true,nullable = false)
	private Integer tapNumber = 1;

	@Column(nullable = false)
	private String beerName;

	@Column//(nullable = false)
	private Double beerCost;

	@Column
	private Boolean beerStopped = false;

	@Column
	private Double beerBalance;



}
