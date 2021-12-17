package de.tekup.ex.entites;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import de.tekup.ex.repos.ReservationRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ServiceExample {

	private ReservationRepository reservationRepository;
	public List<Enseignant> listOfEnsignantWithReservation(){
		/*
		 * return reservationRepository.findAll().stream() .map(res->
		 * res.getEnseignant()) .distinct() .collect(Collectors.toList());
		 */
		//*************
		//return reservationRepository.findAllReservingEnseignant();
		///**********************
		/*
		 * Set<Enseignant> set = new HashSet<>();
		 * 
		 * for (Reservation reservation : reservationRepository.findAll()) {
		 * set.add(reservation.getEnseignant()); } return new ArrayList<>(set);
		 */
		//*************
		List<Enseignant> list = new ArrayList<>();
		
		for (Reservation reservation : reservationRepository.findAll()) {
			if(!list.contains(reservation.getEnseignant()))
				list.add(reservation.getEnseignant());
		}
		
		return list;
	}
}
