package designPatterns.state.softwareDevelopmentProject;

public class Testing implements iProjectState {

	@Override
	public void doRequirementsGathering() {
		System.out.println("Requirements gathering already completed.");
	}

	@Override
	public void doDevelopment() {
		System.out
				.println("Development already completed.");
	}

	@Override
	public void doTesting() {
		System.out
				.println("Testing started and is in progress");
	}

}
