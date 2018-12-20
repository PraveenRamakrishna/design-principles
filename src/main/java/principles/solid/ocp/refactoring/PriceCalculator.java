package principles.solid.ocp.refactoring;

import principles.solid.ocp.OrderItem;

public interface PriceCalculator {

	double calculatePrice(OrderItem orderItem);
}
