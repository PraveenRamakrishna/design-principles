package principles.solid.dip.refactoring;

import principles.solid.dip.Developer;

public class BackEndDeveloper implements Developer {

	@Override
	public String develop() {
		return writeJava();
	}

	String writeJava() {
		return "HelloWorld.java";
	}
}
