package designPatterns.state.atmMachine;

public class ATMContext {

	private ATMState state;
	boolean hasEnteredCorrectPin;
	protected int totalBalance = 2000;
	
	public ATMContext(ATMState state){
		this.state = state;
	}

	public void setState(ATMState state) {
		this.state = state;
	}

	public ATMState getState() {
		return state;
	}
	
}
