package de.tekup.ex.entites;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Etudient extends User {

	@ManyToOne
	private ClassRoom classRoom;
}
