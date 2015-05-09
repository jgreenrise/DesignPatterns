package designPatterns.state.vendingMachine;

public class HasMoneyState implements iVendingMachineState {

	@Override
	public void enterMoney(VendingMachineContext context, int money) {
		// Validate money
		context.setCurrentBalance(context.getCurrentBalance() + money);
		System.out.println("Your current balance: $"
				+ context.getCurrentBalance() + ". Min balance required: $5");
	}

	@Override
	public void selectProduct(VendingMachineContext context, String name) {
		System.out
				.println("Event name: select product. Product selected: "+name);
		context.setState(new HasSelecetedProduct());
	}

	@Override
	public void terminateTransaction(VendingMachineContext context) {
		System.out
				.println("Event name: Terminate trans. ");
		System.out.println("Money returned to user: "
				+ context.getCurrentBalance());
		context.setCurrentBalance(0);
		context.setState(new NoMoneyState());
	}

	@Override
	public void getProduct(VendingMachineContext context) {
		System.out
				.println("Event name: Get product. Please select product to proceed. ");
	}

}
