package designPatterns.state.vendingMachine;

public class HasSelecetedProduct implements iVendingMachineState {

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
				.println("Event name: select product. Product already selected ");
	}

	@Override
	public void terminateTransaction(VendingMachineContext context) {
		System.out
				.println("Event name: Terminating trans.");
		System.out.println("Money returned to user: "
				+ context.getCurrentBalance());
		context.setCurrentBalance(0);
		context.setState(new NoMoneyState());
	}

	@Override
	public void getProduct(VendingMachineContext context) {
		System.out
				.println("Event name: Get product. Product dispersed to user. ");
		context.setCurrentBalance(context.getCurrentBalance()-5);
		System.out.println("Your current balance: $"
				+ context.getCurrentBalance() + ". Min balance required: $5");
		
		if(context.getCurrentBalance() < 5){
			context.setState(new NoMoneyState());
		}else{
			context.setState(new HasMoneyState());
		}
		
		
	}

}
