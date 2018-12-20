package principles.solid.srp.refactoring;

import java.util.List;

import principles.solid.srp.Item;

public interface InventoryService {
	
	public void reserve(List<Item> items);

}
