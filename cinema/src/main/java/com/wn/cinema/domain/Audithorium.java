package com.wn.cinema.domain;

import java.util.ArrayList;
import java.util.Random;

public class Audithorium {

	private int rows;
	private int cols;
	private int id;
	private Movie movie;
	private int numberOfSeats;
	private int numberOfEmptySeats;
	
	ArrayList<Seat> seats = new ArrayList<Seat>();
	ArrayList<Seat> emptySeats = new ArrayList<Seat>();
	
	public Audithorium(){
		super();
	}
	
	public Audithorium(int rows, int cols, int id){
		this.setRows(rows);
		this.setCols(cols);
		for (int i=1; i<rows+1; i++){
			for (int j=1; j<cols+1; j++){
				double rand = new Random().nextDouble();
				
				Seat seat = new Seat(i, j, rand<0.5);
				if (seat.getOccupied()){
				seats.add(seat);
				}
				else {
				seats.add(seat);
				emptySeats.add(seat);
			}}
		}
		this.setId(id);
		this.setNumberOfEmptySeats(emptySeats.size());
		this.numberOfSeats = rows*cols;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}

	public ArrayList<Seat> getSeats() {
		return seats;
	}

	public void setSeats(ArrayList<Seat> seats) {
		this.seats = seats;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public int getNumberOfEmptySeats() {
		return numberOfEmptySeats;
	}

	public void setNumberOfEmptySeats(int numberOfEmptySeats) {
		this.numberOfEmptySeats = numberOfEmptySeats;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	
	
	
}
