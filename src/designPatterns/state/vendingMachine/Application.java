package designPatterns.state.vendingMachine;

/*-
 * Current balance: 0
 Event name: Get product. Please enter money to proceed. 
 Event name: Terminate trans. Have a good day. 
 Only US $ bill 5,10. 20 accepeted
 Only US $ bill 5,10. 20 accepeted
 Only US $ bill 5,10. 20 accepeted
 Your current balance: $5. Min balance required: $5
 Only US $ bill 5,10. 20 accepeted
 Your current balance: $25. Min balance required: $5

 STATE from has money to no product
 Event name: Get product. Please select product to proceed. 
 Event name: select product. Product selected: Apple

 STATE from PRODUCT-SELECTED to HAS-SELECTED-PRODUCT
 Event name: Get product. Product dispersed to user. 
 Your current balance: $20. Min balance required: $5

 Terminate transaction
 Event name: Terminate trans. 
 Money returned to user: 20

 Select product without entering money
 Event name: select product. Please enter money to proceed. Current balance: 0

 */
public class Application {

	public static void main(String[] args) {

		VendingMachineContext context = new VendingMachineContext();
		System.out.println("Current balance: " + context.getCurrentBalance());

		context.getState().getProduct(context);
		context.getState().terminateTransaction(context);
		context.getState().enterMoney(context, 1);
		context.getState().enterMoney(context, 3);
		context.getState().enterMoney(context, 4);
		context.getState().enterMoney(context, 5);
		context.getState().enterMoney(context, 6);
		context.getState().enterMoney(context, 20);

		System.out.println("\nSTATE from has money to no product");
		context.getState().getProduct(context);
		context.getState().selectProduct(context, "Apple");

		System.out
				.println("\nSTATE from PRODUCT-SELECTED to HAS-SELECTED-PRODUCT");
		context.getState().getProduct(context);

		System.out.println("\nTerminate transaction");
		context.getState().terminateTransaction(context);

		System.out.println("\nSelect product without entering money");
		context.getState().selectProduct(context, "Apple");

	}

}
