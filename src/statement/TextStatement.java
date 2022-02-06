package src.statement;

import src.customer.Customer;
import src.rental.Rental;

public class TextStatement extends Statement {

	@Override
	protected String getFrequentRenterPointsEarned(Customer aCustomer) {
		return "You earned " +
				String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
				" frequent renter points";
	}

	@Override
	protected String getAmountOwed(Customer aCustomer) {
		return "Amount owed is " +
				String.valueOf(aCustomer.getTotalCharge()) + "\n";
	}

	@Override
	protected String getRentalFigures(Rental each) {
		return "\t" + each.getMovie().getTitle() + "\t" +
				String.valueOf(each.getCharge()) + "\n";
	}

	@Override
	protected String getCurtomerName(Customer aCustomer) {
		return "Rental Record for " + aCustomer.getName() + "\n";
	}

}
