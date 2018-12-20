package principles.solid.lsp.refactoring;

import principles.solid.lsp.Dog;;

public class BullDog extends Dog {

	@Override
	protected String noise() {
		return "rffff!";
	}
}
