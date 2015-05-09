package designPatterns.state.vendingMachine;

/**
 * This state exists when users current balance is less than $5
 */
public class NoMoneyState implements iVendingMachineState {

	@Override
	public void enterMoney(VendingMachineContext context, int money) {
		if (money == 5 || money == 10 || money == 20) {
			// Validate money
			context.setCurrentBalance(context.getCurrentBalance() + money);

			// User needs to deposit atleast 5 dollars to proceeed
			if (context.getCurrentBalance() > 5)
				context.setState(new HasMoneyState());

			System.out.println("Your current balance: $"
					+ context.getCurrentBalance()
					+ ". Min balance required: $5");
		} else {
			System.out.println("Only US $ bill 5,10. 20 accepeted");
		}

	}

	@Override
	public void selectProduct(VendingMachineContext context, String productName) {
		System.out
				.println("Event name: select product. Please enter money to proceed. Current balance: "
						+ context.getCurrentBalance());
	}

	@Override
	public void terminateTransaction(VendingMachineContext context) {
		System.out.println("Event name: Terminate trans. Have a good day. ");
	}

	@Override
	public void getProduct(VendingMachineContext context) {
		System.out
				.println("Event name: Get product. Please enter money to proceed. ");
	}

}
