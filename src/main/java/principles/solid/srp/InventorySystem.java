package principles.solid.srp;

public class InventorySystem {
	public void reserve(Item item){		
		System.out.println(String.format("Reserve %s number for SKU %S", item.getQuantity(), item.getSku()));
	}
}
