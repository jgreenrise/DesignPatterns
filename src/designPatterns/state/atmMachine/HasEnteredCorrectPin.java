package designPatterns.state.atmMachine;

public class HasEnteredCorrectPin implements ATMState {

	@Override
	public void insertCard(ATMContext context) {
		System.out
				.println("Event insert card. Card is already inserted. Cannot insert more than one card. To eject, click ejectr button");
	}

	@Override
	public void ejectCard(ATMContext context) {
		System.out.println("Eject card  event called");
		context.setState(new NoCardState());

	}

	@Override
	public void insertPin(ATMContext context, int pinEntered) {
		System.out
				.println("Event insert pin. Correct pin has been already enetered.");

	}

	@Override
	public void requestCash(ATMContext context, int desiredCash) {
		if (desiredCash < context.totalBalance) {
			System.out.println("Event: request cash. Cash ejected: "
					+ desiredCash);
			context.totalBalance = context.totalBalance - desiredCash;
		} else {
			System.out.println("ATM doesnt have sufficient balance.");
			context.setState(new ATMOutOfMemoryState());
		}
	}

}
