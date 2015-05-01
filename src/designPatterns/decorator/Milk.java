package designPatterns.decorator;

public class Milk extends CoffeeDecorator {

	public Milk(Coffee cofee) {
		super(cofee);
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice() + 2;
	}

	public String getIngredients() {
		// TODO Auto-generated method stub
		return super.getIngredients() + ", Milk";
	}

}
