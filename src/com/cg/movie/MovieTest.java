package com.cg.movie;

//Class to implement all the methods
public class MovieTest {

	// Main method
	public static void main(String[] args) {

		// Creating object
		MovieDetailsList moviedetailslist = new MovieDetailsList();

		// Adding movies to the list
		moviedetailslist.add_movie(new Movie_Details("Zero", "Shahrukh Khan", "Katrina Kaif", "Comedy"));
		moviedetailslist.add_movie(new Movie_Details("Tiger Zinda Hai", "Salman Khan", "Katrina Kaif", "Action"));
		moviedetailslist.add_movie(new Movie_Details("Airlift", "Akshay Kumar", "Pta nhi", "Patriotic"));
		moviedetailslist.add_movie(new Movie_Details("Sanju", "Ranbeer Kapoor", "Diya Mirza", "Biography"));
		moviedetailslist.add_movie(new Movie_Details("M.S.Dhoni", "Shushant Singh Rajput", "Disha Paatni", "Biography"));

		// removing a movie by its name
		moviedetailslist.remove_movie("Tiger Zinda Hai");

		// displays all the list
		moviedetailslist.display();

		boolean x = moviedetailslist.find_movie_by_mov_name("Zero");
		if (x == true) {
			System.out.println("Movie Found");
		} else {
			System.out.println("Movie not found");
		}

	}

}
