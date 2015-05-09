package designPatterns.state.atmMachine;

public interface ATMState {
	
	void insertCard(ATMContext context);
	void ejectCard(ATMContext context);
	void insertPin(ATMContext context, int pinEntered);
	void requestCash(ATMContext context, int desiredCash);

}
