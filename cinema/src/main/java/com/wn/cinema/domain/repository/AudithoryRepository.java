package com.wn.cinema.domain.repository;

import java.util.List;

import com.wn.cinema.domain.Movie;
import com.wn.cinema.domain.Seat;

public interface AudithoryRepository {

	List<Seat> getAllSeats();

	Seat getSeatByCoordinates(int col, int row);

	Movie getMovie();
}
