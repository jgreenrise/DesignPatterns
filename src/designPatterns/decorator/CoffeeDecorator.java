package designPatterns.decorator;

public class CoffeeDecorator implements Coffee {

	private Coffee cofee;

	public CoffeeDecorator(Coffee cofee) {
		this.cofee = cofee;
	}

	@Override
	public double getPrice() {
		return cofee.getPrice();
	}

	@Override
	public String getIngredients() {
		return cofee.getIngredients();
	}

}
