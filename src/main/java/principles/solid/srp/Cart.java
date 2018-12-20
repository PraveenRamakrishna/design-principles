package principles.solid.srp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Cart {
	
	private BigDecimal totalAmount = new BigDecimal("0.0");
	
	private long numberOfItems = 0;	
	
	private List<Item> items = new ArrayList<>();

}
