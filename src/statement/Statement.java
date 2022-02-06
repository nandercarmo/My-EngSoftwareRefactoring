package src.statement;

import java.util.Enumeration;

import src.customer.Customer;
import src.rental.Rental;

public abstract class Statement {

	public String value(Customer aCustomer) {
		Enumeration rentals = aCustomer.getRentals();
		String result = this.getCurtomerName(aCustomer);
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			// show figures for each rental
			result += this.getRentalFigures(each);
		}

		// add footer lines
		result += this.getAmountOwed(aCustomer);
		result += this.getFrequentRenterPointsEarned(aCustomer);
		return result;
	}

	protected abstract String getFrequentRenterPointsEarned(Customer aCustomer);

	protected abstract String getAmountOwed(Customer aCustomer);

	protected abstract String getRentalFigures(Rental each);

	protected abstract String getCurtomerName(Customer aCustomer);
}
