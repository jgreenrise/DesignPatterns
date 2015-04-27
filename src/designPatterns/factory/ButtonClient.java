package designPatterns.factory;

public class ButtonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ButtonFactory buttonfactory = new ButtonFactory();
		Button button = buttonfactory.getButton("windows");
		button.draw();
		
		button = buttonfactory.getButton("linux");
		button.draw();
		

	}

}
