package principles.solid.ocp.refactoring; 

import java.util.ArrayList;
import java.util.List;

import principles.solid.ocp.OrderItem;
import principles.solid.ocp.refactoring.ItemPriceCalculator;
import principles.solid.ocp.refactoring.PriceCalculator;

public class Cart {
	
	private List<OrderItem> items;
	
	private PriceCalculator priceCalculator;
	
	public Cart(){
		this.items = new ArrayList<>();
		this.priceCalculator = new ItemPriceCalculator();
	}
	
	public Cart(PriceCalculator priceCalculator){
		this.items = new ArrayList<>();
		this.priceCalculator = priceCalculator;
	}
	
	public void addItem(OrderItem orderItem){
		items.add(orderItem);
	}

	public double totalAmount(){
		double total  = 0.0;		
		for (OrderItem orderItem : items) {
			total += priceCalculator.calculatePrice(orderItem);			
		}
		return total;
	}
}
