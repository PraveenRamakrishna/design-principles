package principles.solid.ocp.problem; 

import java.util.ArrayList;
import java.util.List;

import principles.solid.ocp.OrderItem;

public class Cart {
	
	private List<OrderItem> items;
	
	public Cart(){
		this.items = new ArrayList<>();
	}
	
	public void addItem(OrderItem orderItem){
		items.add(orderItem);
	}

	public double totalAmount(){
		double total  = 0.0;
		for (OrderItem orderItem : items) {
			
			if(orderItem.getSku().startsWith("EACH")){
				total += orderItem.getQuntity() * orderItem.getPrice();
			}else if(orderItem.getSku().startsWith("BOGO")){
				total += orderItem.getQuntity() * orderItem.getPrice();
				if(orderItem.getQuntity()>1){
					long bogo = orderItem.getQuntity() / 2;
					total -= bogo*orderItem.getPrice();
				}
			}else if(orderItem.getSku().startsWith("50%")){
				total += orderItem.getQuntity() * orderItem.getPrice() * (0.5);  				
			}//More Rules to come
		}
		return total;
	}
}
