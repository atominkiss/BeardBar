package net.protoprint.beardbar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

//Lombok annotations
@Data
@NoArgsConstructor
@AllArgsConstructor

// JPA annotations
@Entity
@Table(name = "Bill")
public class Bill {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "billName", nullable = false)
	private String billName;

	@OneToMany(mappedBy = "bill", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	//Попробуем Set. Значения в сете могут быть только уникальные.
	private Set<Beer> beers;



}
