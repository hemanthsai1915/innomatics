package com.sai.innomatics;

public class ServiceProvider {

	public Movie getMovie(String movie) {
		if(movie.equals("Spiderman")){
			return new Spiderman();
		}
		else if(movie.equals("Dune")){
			return new Dune();
			
		}
		else if(movie.equals("Doomsday")){
			return new Doomsday();
		}
		else {
			return null;
		}
	}
	
		
	}

