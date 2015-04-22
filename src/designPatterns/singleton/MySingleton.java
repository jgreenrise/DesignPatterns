package designPatterns.singleton;

public class MySingleton {
	
	private static MySingleton instance = null;
	
	private MySingleton(){
		
	}
	
	public static MySingleton getInstance(){
		
		if(instance == null){
			synchronized (MySingleton.class) {
				if(instance == null){
					return new MySingleton();
				}
			}
		}
		
		return instance;
		
	}

}
