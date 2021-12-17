package de.tekup.ex.entites;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class ClassRoom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private int sutdentNumber;
	
	@OneToMany(mappedBy = "classRoom")
	private List<Etudient> etudiants;
	
	@ManyToMany(mappedBy = "classes")
	private List<Enseignant> enseignants;
	
	@OneToMany(mappedBy = "classRoom")
	private List<Reservation> reservations;
}
