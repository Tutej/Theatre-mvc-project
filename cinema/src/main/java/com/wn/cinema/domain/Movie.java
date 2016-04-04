package com.wn.cinema.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Movie {

	private String title;
	private String showDate;
	private String showTime;
	private String datePattern = "dd-MM-yyyy";
	private String hourPattern = "h:MM";
	private SimpleDateFormat sdfDate = new SimpleDateFormat(datePattern);
	private SimpleDateFormat sdfHour = new SimpleDateFormat(hourPattern);
	private boolean thereAreVacanties;
	private double duration;
	
	
	public Movie(){
		super();
	}
	
	
	/**
	 * Reprezentuje film
	 * 
	 * @param showDate -
	 *            data rozpoczêcia filmu
	 * @param showTime -
	 *            godzina i minuta rozpoczêcia filmu
	 * @param title -
	 *            tytu³ filmu
	 *            
	 * @param duration -
	 * 				czas trwania filmu w minutach
	 * @throws ParseException -
	 *             gdy nie znaleziono wskazanego pliku na dysku, a jest w indeksie
	 */
	public Movie(String showDate, String showTime, String title, double duration){
		
		this.setTitle(title);
		Date testDate = null;
		try {
			testDate= sdfDate.parse(showDate);
		} catch (ParseException e) {
			System.out.println("________________________________________");
			System.out.println("");
			System.out.println("B³¹d parsowania daty");
			System.out.println("");
			System.out.println("________________________________________");
		}
		String testDateString = sdfDate.format(testDate);
		this.setShowDate(testDateString);
		try {
			testDate= sdfHour.parse(showTime);
		} catch (ParseException e) {
			System.out.println("________________________________________");
			System.out.println("");
			System.out.println("B³¹d parsowania godziny");
			System.out.println("");
			System.out.println("________________________________________");
		}
		testDateString = sdfHour.format(testDate);
		this.setShowTime(testDateString);
		this.setDuration(duration);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public boolean isThereAreVacanties() {
		return thereAreVacanties;
	}

	public void setThereAreVacanties(boolean thereAreVacanties) {
		this.thereAreVacanties = thereAreVacanties;
	}

	public String getShowDate() {
		return showDate;
	}

	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}


	public double getDuration() {
		return duration;
	}


	public void setDuration(double duration) {
		this.duration = duration;
	}

	
	
	
	
}
