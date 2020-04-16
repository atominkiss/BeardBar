package net.protoprint.beardbar.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
@Table(name = "Beers")
public class Beer extends MenuItem {

	public Beer(Integer tapNumber, Double beerBalance) {
		super("",0.00,false);
		this.tapNumber = tapNumber;
		this.beerBalance = beerBalance;
	}

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true,nullable = false)
	private Integer tapNumber = 1;

	@Column(nullable = false)
	private String beerName = super.getName();

	@Column//(nullable = false)
	private Double beerCost = super.getCost();

	@Column
	private Boolean beerStopped = super.getStopped();

	@Column
	private Double beerBalance;

}
