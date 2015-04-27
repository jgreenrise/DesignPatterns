package designPatterns.factory;

public class ButtonFactory {
	
	public static Button getButton(String name){
		
		if(name.equalsIgnoreCase("Windows"))
			return new WindowsButton();
		else if(name.equalsIgnoreCase("Linux"))
			return new LinuxButton();
		else 
			return new MacButton();
	}

}
