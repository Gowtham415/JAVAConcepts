package ComparatbleAndComparator;

import java.util.Comparator;

public class Movie implements Comparable<Movie> {
	private String name;
	private double runTimeinMinutes;
	private int year;

	public Movie(String name, Double runTimeinMinutes, int year) {
		this.name = name;
		this.runTimeinMinutes = runTimeinMinutes;
		this.year = year;
	}
	
	
	public String getName() {
		return this.name;
	}

	
	
	public Double getRunTimeinMinutes() {
		return runTimeinMinutes;
	}


	public int getYear() {
		return year;
	}


	/*
	 * For Comparable Interface
	 */
	@Override
	public int compareTo(Movie o) {
		return this.name.compareTo(o.name);
	}
	
	
	

}

/*
 * For Comparator Interface
 */

class runTimeComparison implements Comparator<Movie> {

	// By runTime
	@Override
	public int compare(Movie o1, Movie o2) {
		if (o1.getRunTimeinMinutes() > o2.getRunTimeinMinutes())
			return 1;
		else if (o1.getRunTimeinMinutes() == o2.getRunTimeinMinutes())
			return 0;
		return -1;

	}
}

class yesrWiseCompare implements Comparator<Movie> {
	// By Year
	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.getYear() - o2.getYear();
	}
}
