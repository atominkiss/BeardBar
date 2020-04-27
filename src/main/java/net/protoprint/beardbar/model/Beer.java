package net.protoprint.beardbar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	@NotBlank(message = "Введите номер крана")
	private Integer tapNumber = 1;

	@Column(nullable = false)
	@NotBlank(message = "Введите наименование пива")
	private String beerName;

	@Column//(nullable = false)
	@NotBlank(message = "Стоимость не может быть равна 0")
	private Double beerCost;

	@Column
	private Boolean beerStopped;

	@Column
	private Double beerBalance;

//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "bill_id")
//	private Bill bill ;


}
