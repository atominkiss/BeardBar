package net.protoprint.beardbar.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
abstract class MenuItem {

	private String name;
	private Double cost;
	private Boolean stopped = false;

	MenuItem(String name, Double cost, Boolean stopped) {
		this.name = name;
		this.cost = cost;
		this.stopped = stopped;
	}
}
