package principles.solid.dip.problem;

import principles.solid.dip.BackEndDeveloper;
import principles.solid.dip.FrontEndDeveloper;

public class Project {
	//Project class is a high-level module, and it depends on low-level modules.
	private BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
	
	private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();

	public void implement() {
		backEndDeveloper.writeJava();
		frontEndDeveloper.writeJavascript();
	}
}