package principles.solid.dip.refactoring;

import principles.solid.dip.Developer;

public class FrontEndDeveloper implements Developer {

	@Override
	public String develop() {
		return writeHTML();
	}

	String writeHTML() {
		return "HelloWorld.html";
	}
}
