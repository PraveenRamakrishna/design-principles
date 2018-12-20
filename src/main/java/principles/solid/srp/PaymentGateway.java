package principles.solid.srp;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class PaymentGateway {

	private String creditCardNumber;
	
	private String expireMonth;
	
	private String expireYear;
	
	private String nameOnTheCard;
	
	private BigDecimal amountToCharge;
	
	public void charge(){
		System.out.println(String.format("% amount charged againt card # %",amountToCharge,creditCardNumber));
	}
}
