package designPatterns.state.vendingMachine;

public interface iVendingMachineState {
	
	void enterMoney(VendingMachineContext context, int money);
	void selectProduct(VendingMachineContext context, String name);
	void terminateTransaction(VendingMachineContext context);
	void getProduct(VendingMachineContext context);

}
