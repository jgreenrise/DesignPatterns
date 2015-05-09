package designPatterns.state.emotionalState;

public class PersonContext {
	
	iState state = null;
	
	public PersonContext(iState state){
		this.state = state;
	}

	public iState getState() {
		return state;
	}

	public void setState(iState state) {
		this.state = state;
	}
	
}
