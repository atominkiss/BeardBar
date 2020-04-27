package net.protoprint.beardbar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
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

//	@OneToMany(mappedBy = "bill", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@ManyToMany
	@JoinTable(
			name = "bill_beer",
			joinColumns = {@JoinColumn(name = "beer_id")},
			inverseJoinColumns = {@JoinColumn(name = "bill_id")}
	)
//	Попробуем Set. Значения в сете могут быть только уникальные. HashSet к тому же может хранить null
	private Set<Beer> beers = new HashSet<>();

	@ManyToMany
	@JoinTable(
			name = "bill_beer",
			joinColumns = {@JoinColumn(name = "bill_id")},
			inverseJoinColumns = {@JoinColumn(name = "beer_id")}
	)
//	Попробуем Set. Значения в сете могут быть только уникальные. HashSet к тому же может хранить null
	private Set<Beer> bill = new HashSet<>();


	public Bill(String billName) {
		this.billName = billName;
	}
}
