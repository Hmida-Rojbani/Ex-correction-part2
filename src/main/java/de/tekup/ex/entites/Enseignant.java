package de.tekup.ex.entites;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Enseignant extends User{

	private String matierPrincipale;
	
	@ManyToMany
	private List<ClassRoom> classes;
	
	@OneToMany(mappedBy = "enseignant")
	private List<Reservation> reservations;
}
