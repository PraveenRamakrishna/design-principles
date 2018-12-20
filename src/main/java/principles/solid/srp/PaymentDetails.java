package principles.solid.srp;

import lombok.Data;

@Data
public class PaymentDetails {
	
	private String creditCardNumber;
	
	private String expireMonth;
	
	private String expireYear;
	
	private String nameOnTheCard;
	
	private PaymentMethod paymentMethod;
}
