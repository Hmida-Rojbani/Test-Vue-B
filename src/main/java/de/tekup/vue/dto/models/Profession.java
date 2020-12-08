package de.tekup.vue.dto.models;

import lombok.Getter;

@Getter
public enum Profession {
	DEVELOPPER("Developper"), TESTER("Tester"), ARCHITECT("Architect");
	
	private String displayValue;
	
	private Profession(String value) {
		displayValue=value;
	}
	
	
}
