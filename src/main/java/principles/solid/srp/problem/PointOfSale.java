package principles.solid.srp.problem;

import lombok.Data;

@Data
public class PointOfSale {
	private Order order;
	
	public void processOrder(Order order){
		this.order = order;
	}

}