package de.tekup.ex.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import de.tekup.ex.entites.Enseignant;
import de.tekup.ex.entites.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>{

	@Query(nativeQuery = true,
	value = "select distinct(ensignant) from reservation")
	List<Enseignant> findAllReservingEnseignant();

}
