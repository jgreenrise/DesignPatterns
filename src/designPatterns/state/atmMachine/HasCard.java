package designPatterns.state.atmMachine;

public class HasCard implements ATMState {

	@Override
	public void insertCard(ATMContext context) {
		System.out.println("You can only insert one card at a time");
	}

	@Override
	public void ejectCard(ATMContext context) {
		System.out.println("Your card is ejected. Moving to state: No card");
		context.setState(new NoCardState());
	}

	@Override
	public void insertPin(ATMContext context, int pinEntered) {
		if (pinEntered == 3456) {
			context.setState(new HasEnteredCorrectPin());
		} else {
			System.out.println("Enetered pin is incorrect. Please try again.");
		}
	}

	@Override
	public void requestCash(ATMContext context, int desiredCash) {
		System.out.println("Event: requestCash. Please eneter pin to resume.");
	}

}
