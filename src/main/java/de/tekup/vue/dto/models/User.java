package de.tekup.vue.dto.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import lombok.Data;

@Data
public class User {

	private String name;
	private String email;
	private String password;

	// add theses fields to HTML
	private String gender;
	private String note;
	private boolean married;
	private LocalDate birthDate = LocalDate.now();
	private String profession;
	
	public void setBirthDate(String date) {
		birthDate = LocalDate.parse(date);
	}
	
	public String getBirthDate() {
		DateTimeFormatter f= DateTimeFormatter.ofPattern("dd, MMMM yyyy");
		return birthDate.format(f);
	}
}
