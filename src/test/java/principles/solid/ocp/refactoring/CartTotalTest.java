package principles.solid.ocp.refactoring;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import principles.solid.ocp.OrderItem;

public class CartTotalTest {
	
	private Cart cart;
	
	@Before
	public void init(){
		this.cart = new Cart();
	}

	@Test
	public void zeroWhenEmpty(){
		assertEquals(0.0, cart.totalAmount(),0);
	}

	@Test
	public void FiveWithOrginalPrice(){
		cart.addItem(new OrderItem("EACH", 5, 0.5));
		assertEquals(2.5, cart.totalAmount(),0.0);
	}
	
	@Test 
	public void ThreeBOGOItems(){
		cart.addItem(new OrderItem("BOGO", 3, 1));
		assertEquals(2.0, cart.totalAmount(),0.0);
	}
	
	@Test
	public void OneBOGOItem(){
		cart.addItem(new OrderItem("BOGO", 1, 1));
		assertEquals(1.0, cart.totalAmount(),0.0);
	}

	@Test
	public void SixBOGOItems(){
		cart.addItem(new OrderItem("BOGO", 6, 0.5));
		assertEquals(1.5, cart.totalAmount(),0.0);
	}

	@Test
	public void FiftyDiscount(){
		cart.addItem(new OrderItem("50%", 5, 0.5));
		assertEquals(1.25, cart.totalAmount(),0.0);
	}
	
	@Test 
	public void multipleItems(){
		cart.addItem(new OrderItem("EACH", 1, 1));
		cart.addItem(new OrderItem("BOGO", 10, 0.5));
		cart.addItem(new OrderItem("50%", 5, 1));
		assertEquals(6.0, cart.totalAmount(),0.0);
	}
	
	@Test 
	public void sixtyDiscount(){
		cart.addItem(new OrderItem("60%", 2, 1));
		assertEquals(0.8, cart.totalAmount(),0.0);
	}
	
}
