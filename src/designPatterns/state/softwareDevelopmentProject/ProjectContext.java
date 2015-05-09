package designPatterns.state.softwareDevelopmentProject;

public class ProjectContext implements iProjectState {

	private iProjectState state;

	public ProjectContext(iProjectState state) {
		this.state = state;
	}

	public void setState(iProjectState state) {
		this.state = state;
	}

	@Override
	public void doRequirementsGathering() {

		state.doRequirementsGathering();

		if (state instanceof RequiementGathering) {
			this.setState(new Development());
			System.out
					.println("\nChanging state from REQUIREMENT-GATERING to DEVELOPMENT");
		}

	}

	@Override
	public void doDevelopment() {
		// TODO Auto-generated method stub

		state.doDevelopment();

		if (state instanceof Development) {
			this.setState(new Testing());
			System.out.println("\nChanging state from DEVELOPMENT to TESTING");
		}

	}

	@Override
	public void doTesting() {

		state.doTesting();

	}

}
