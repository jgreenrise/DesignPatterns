package designPatterns.decorator;

public class Whip extends CoffeeDecorator {

	public Whip(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice() + 4;
	}

	public String getIngredients() {
		// TODO Auto-generated method stub
		return super.getIngredients() + ", Whip";
	}

}
