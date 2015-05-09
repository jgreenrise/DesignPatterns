package designPatterns.state.softwareDevelopmentProject;

public class Development implements iProjectState {

	@Override
	public void doRequirementsGathering() {
		System.out.println(" Requirements already gathered. ");
	}

	@Override
	public void doDevelopment() {
		// TODO Auto-generated method stub
		System.out.println("Started developing features");

	}

	@Override
	public void doTesting() {
		System.out.println(" Cannot test. Development in progess.");

	}

}
