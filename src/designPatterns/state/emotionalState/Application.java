package designPatterns.state.emotionalState;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonContext context = new PersonContext(new HappyState());
		
		context.getState().sayeHello();
		context.getState().sayGoodBye();
		
		context = new PersonContext(new SadState());
		
		context.getState().sayeHello();
		context.getState().sayGoodBye();

	}

}
