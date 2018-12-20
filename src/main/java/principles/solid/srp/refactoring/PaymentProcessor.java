package principles.solid.srp.refactoring;

import principles.solid.srp.PaymentDetails;

public interface PaymentProcessor {

	void process(PaymentDetails details);
}
