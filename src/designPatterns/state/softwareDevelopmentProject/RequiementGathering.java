package designPatterns.state.softwareDevelopmentProject;

public class RequiementGathering implements iProjectState {

	@Override
	public void doRequirementsGathering() {
		System.out.println("Requirements gathering in progress");
	}

	@Override
	public void doDevelopment() {
		System.out.println("Requirements gathering in progress. Cannot work on development");
	}

	@Override
	public void doTesting() {
		System.out.println("Requirements gathering in progress. Cannot work on testing");
	}

}
