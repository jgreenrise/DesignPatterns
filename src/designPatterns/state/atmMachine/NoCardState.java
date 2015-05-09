package designPatterns.state.atmMachine;

public class NoCardState implements ATMState {

	@Override
	public void insertCard(ATMContext context) {
		// TODO Auto-generated method stub
		System.out.println("Card is inserted.");
		context.setState(new HasCard());
	}

	@Override
	public void ejectCard(ATMContext context) {
		System.out.println("Event eject card: Card is not avilable. Insert card to proceed");
	}
	
	@Override
	public void insertPin(ATMContext context, int pinEntered) {
		System.out.println("Event insert pin: Card is not avilable. Insert card to proceed");
	}

	@Override
	public void requestCash(ATMContext context, int desiredCash) {
		System.out.println("Request cash: Card is not avilable. Insert card to proceed");
	}

}
