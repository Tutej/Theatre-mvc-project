package com.wn.cinema.domain;

public class Seat {

	private int row;
	private int col;
	private boolean isOccupied;
	private String isOccupiedString;
	
	public Seat(){ 
	super();
	}
	
	
	public Seat(int row, int col){
		this.setCol(col);
		this.setRow(row);
	}
	public Seat(int row, int col, boolean isOccupied){
		this.setCol(col);
		this.setRow(row);
		this.setOccupied(isOccupied);
		if (isOccupied)
			isOccupiedString = "zajêty";
		else
			isOccupiedString = "wolny";
	}
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public boolean getOccupied() {
		return isOccupied;
	}
	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}


	public String getIsOccupiedString() {
		return isOccupiedString;
	}


	public void setIsOccupiedString(String isOccupiedString) {
		this.isOccupiedString = isOccupiedString;
	}
	
	
	
}
