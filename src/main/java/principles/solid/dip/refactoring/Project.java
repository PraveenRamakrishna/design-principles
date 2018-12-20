package principles.solid.dip.refactoring;

import java.util.List;

import principles.solid.dip.Developer;

public class Project {

	private List<Developer> developers;

	public Project(List<Developer> developers) {
		this.developers = developers;
	}

	public void implement() {
		developers.forEach(d -> d.develop());
	}
}