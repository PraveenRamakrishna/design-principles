package principles.solid.ocp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderItem {
	
	private String sku;
	
	private long quntity;
	
	private double price = 0.0;

}
