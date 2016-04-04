package com.wn.cinema.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Repository;

import com.wn.cinema.domain.Audithorium;
import com.wn.cinema.domain.Movie;
import com.wn.cinema.domain.Seat;
import com.wn.cinema.domain.repository.ThetreRepository;

@Repository
public class InMemoryTheatre implements ThetreRepository{

	
		List<Audithorium> listOfAudithories = new ArrayList<Audithorium>();
		
		public InMemoryTheatre() {
			
			int random = new Random().nextInt(10);
			for (int i=0; i<random; i++){
				int randomRow = new Random().nextInt(10);
				int randomCol = new Random().nextInt(10);	
			Audithorium aud1 =  new Audithorium (randomRow,randomCol, i);
			Movie newMovie = new Movie("01-01-2015", "22:12" ,"Zabili go i uciek³", 90);
			aud1.setMovie(newMovie);
			listOfAudithories.add(aud1);
			}
			
		}


		/*public Seat getSeatByCoordinates(int row, int col) {
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
		}*/


		@Override
		public List<Audithorium> getAllAudithoriums() {
			return listOfAudithories;
		}

		@Override
		public Audithorium getAudithoriumBySize() {
			return null;
		}
	}