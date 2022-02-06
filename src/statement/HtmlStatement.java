package src.statement;

import src.customer.Customer;
import src.rental.Rental;

public class HtmlStatement extends Statement {

	@Override
	protected String getFrequentRenterPointsEarned(Customer aCustomer) {
		return "On this rental you earned <EM>" +
				String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
				"</EM> frequent renter points<P>";
	}

	@Override
	protected String getAmountOwed(Customer aCustomer) {
		return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
	}

	@Override
	protected String getRentalFigures(Rental each) {
		return each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
	}

	@Override
	protected String getCurtomerName(Customer aCustomer) {
		return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
	}
}
