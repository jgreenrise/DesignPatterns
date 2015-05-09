package designPatterns.state.atmMachine;

/*- Output
 * 
 Requesting cash with no card
 Event eject card: Card is not avilable. Insert card to proceed
 Event insert pin: Card is not avilable. Insert card to proceed
 Request cash: Card is not avilable. Insert card to proceed

 Card inserted
 Card is inserted.

 Requesting cash without pin
 Event: requestCash. Please eneter pin to resume.

 User enters wrong pin
 Enetered pin is incorrect. Please try again.

 User enters correct pin

 User withdraws 2200
 Event insert pin. Correct pin has been already enetered.
 Event insert card. Card is already inserted. Cannot insert more than one card. To eject, click ejectr button
 ATM doesnt have sufficient balance.
 This ATM does not have sufficient balance. Click eject to resume or enter smaller amount to eject

 User withdraws 200
 Event: request cash. Cash ejected: 200

 Total balance in ATM: 1800

 Eject card and request for money
 Eject card  event called
 Request cash: Card is not avilable. Insert card to proceed

 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// STATE: NoCard
		ATMContext context = new ATMContext(new NoCardState());

		System.out.println("\nRequesting cash with no card");
		context.getState().ejectCard(context);
		context.getState().insertPin(context, 4567);
		context.getState().requestCash(context, 5000);

		System.out.println("\nCard inserted");
		// STATE: HasCard
		context.getState().insertCard(context);

		System.out.println("\nRequesting cash without pin");
		context.getState().requestCash(context, 5000);

		System.out.println("\nUser enters wrong pin");
		context.getState().insertPin(context, 5678);

		System.out.println("\nUser enters correct pin");
		// STATE: HasEnteredCorrectPin
		context.getState().insertPin(context, 3456);

		System.out.println("\nUser withdraws 2200");
		context.getState().insertPin(context, 3456);
		context.getState().insertCard(context);
		context.getState().requestCash(context, 2200);
		context.getState().requestCash(context, 2200);

		System.out.println("\nUser withdraws 200");
		context.getState().requestCash(context, 200);

		System.out.println("\nTotal balance in ATM: " + context.totalBalance);

		System.out.println("\n Eject card and request for money");
		context.getState().ejectCard(context);
		context.getState().requestCash(context, 200);

	}

}
