package designPatterns.state.softwareDevelopmentProject;

/*-
 * 
 * Requirements gathering in progress. Cannot work on development
Requirements gathering in progress. Cannot work on testing
Requirements gathering in progress

Changing state from REQUIREMENT-GATERING to DEVELOPMENT
 Requirements already gathered. 
Development in progess. Cannot test.
Started developing features

Changing state from DEVELOPMENT to TESTING
Requirements gathering already completed.
Development already completed.
Testing started and is in progress
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProjectContext client = new ProjectContext(new RequiementGathering());

		client.doDevelopment();
		client.doTesting();
		client.doRequirementsGathering(); // State changed to developmenet.
		
		client.doRequirementsGathering();
		client.doTesting();
		client.doDevelopment();	// State changed to testing
		
		client.doRequirementsGathering(); 
		client.doDevelopment();
		client.doTesting();
		
	}

}
