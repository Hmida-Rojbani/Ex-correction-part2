package de.tekup.ex.entites;


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private LocalDateTime beginReservation;
	private LocalDateTime endReservation;
	
	@ManyToOne
	private Enseignant enseignant;
	@ManyToOne
	private ClassRoom classRoom;
	
}
