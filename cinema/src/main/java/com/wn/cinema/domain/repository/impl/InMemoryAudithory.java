package com.wn.cinema.domain.repository.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.wn.cinema.domain.Audithorium;
import com.wn.cinema.domain.Movie;
import com.wn.cinema.domain.Seat;
import com.wn.cinema.domain.repository.AudithoryRepository;

@Repository
public class InMemoryAudithory implements AudithoryRepository{

	
		List<Seat> listOfSeats = new ArrayList<Seat>();
		
		public InMemoryAudithory() {
		
			Audithorium aud1 =  new Audithorium (6,8,1);
			listOfSeats.addAll(aud1.getSeats());
		}

		public List<Seat> getAllSeats() {
			return listOfSeats;
		}

		public Seat getSeatByCoordinates(int row, int col) {
			Seat seatByCoordinate = null;
			
			for(Seat seat : listOfSeats) {
				if(seat!=null && seat.getRow() == (row)){
					seatByCoordinate = seat;
					break;
				}
			}
			
			if(seatByCoordinate == null){
				throw new IllegalArgumentException("Brak produktu o wskazanym po³o¿eniu. Rz¹d: " + row + ", miejsce " + col +".");
			}
			
			return seatByCoordinate;
		}

		@Override
		public Movie getMovie() {
			Movie newMovie = new Movie("01-01-2015", "22:12" ,"Zabili go i uciek³", 90);
			return newMovie;
		}
	}