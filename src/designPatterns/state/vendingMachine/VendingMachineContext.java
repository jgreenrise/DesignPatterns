package designPatterns.state.vendingMachine;

public class VendingMachineContext {
	
	private iVendingMachineState state;
	private int currentBalance = 0;
	
	public VendingMachineContext(){
		this.state = new NoMoneyState();
		currentBalance = 0;
	}
	
	public void setState(iVendingMachineState state){
		this.state = state;
	}
	
	public iVendingMachineState getState(){
		return state;
	}

	public int getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(int currentBalance) {
		this.currentBalance = currentBalance;
	}
	
}
