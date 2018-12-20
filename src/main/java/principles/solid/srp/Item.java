package principles.solid.srp;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Item {
	
	private String sku;
	
	private long quantity;
	
	private BigDecimal price;
	
}
