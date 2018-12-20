package principles.solid.srp.refactoring;

import principles.solid.srp.Cart;

public abstract class Order {
	
	protected Cart cart;
	
	public abstract void checkout();
	
	public Order(Cart cart){
		this.cart = cart;	
	}

}
