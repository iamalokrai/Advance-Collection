package com.cg.movie;

//Class holds the attributes of the movie details
public class Movie_Details {
	String mov_Name;
	String lead_actor;
	String lead_actress;
	String genre;

	// Constructor created having parameter
	public Movie_Details(String mov_Name, String lead_actor, String lead_actress, String genre) {
		super();
		this.mov_Name = mov_Name;
		this.lead_actor = lead_actor;
		this.lead_actress = lead_actress;
		this.genre = genre;
	}

	// Overriding toString method
	@Override
	public String toString() {
		return "Movie_Details [mov_Name=" + mov_Name + ", lead_actor=" + lead_actor + ", lead_actress=" + lead_actress
				+ ", genre=" + genre + "]";
	}

	// Constructor having parameter type movie_details
	public Movie_Details(Movie_Details movie) {
		// TODO Auto-generated constructor stub
	}

	// getter method for movie name
	public String getMov_Name() {
		return mov_Name;
	}

	// setter method for Movie Name
	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}

	public String getLead_actor() {
		return lead_actor;
	}

	// setter method
	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}

	// getter method
	public String getLead_actress() {
		return lead_actress;
	}

	// Setter method
	public void setLead_actress(String lead_actress) {
		this.lead_actress = lead_actress;
	}

	public String getGenre() {
		return genre;
	}

	// Setter method
	public void setGenre(String genre) {
		this.genre = genre;
	}

}
