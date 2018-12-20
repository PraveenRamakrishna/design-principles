package principles.solid.lsp.problem;

import principles.solid.lsp.Dog;

public class HotDog extends Dog implements Edible{
	
	@Override
	protected String noise(){
		throw new UnsupportedOperationException("I am actually a sausage");
	}

	@Override
	public String eat() {
		return "Yummy..!";
	}

}
