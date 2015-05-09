package designPatterns.state.emotionalState;

public class HappyState implements iState {

	@Override
	public void sayeHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello der. How are you.");

	}

	@Override
	public void sayGoodBye() {
		// TODO Auto-generated method stub
		System.out.println("Have a nice day. It was nice talking to you.");

	}

}
