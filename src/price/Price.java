package src.price;

import src.movie.Movie;

public abstract class Price {

	public abstract int getPriceCode();

	public abstract double getCharge(int daysRented);

	public int getFrequentRenterPoints(int daysRented) {
		if ((this.getPriceCode() == Movie.NEW_RELEASE) &&
				daysRented > 1) {
			return 2;
		}

		return 1;
	}
}
