package designPatterns.decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		Coffee coffee = new SimpleCoffee();
		System.out.println("Cost: " + coffee.getPrice() + "; Ingredients: "
				+ coffee.getIngredients());

		coffee = new Milk(coffee);
		System.out.println("Cost: " + coffee.getPrice() + "; Ingredients: "
				+ coffee.getIngredients());

		coffee = new Whip(coffee);
		System.out.println("Cost: " + coffee.getPrice() + "; Ingredients: "
				+ coffee.getIngredients());

	}

}
