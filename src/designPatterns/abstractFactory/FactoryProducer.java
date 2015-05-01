package designPatterns.abstractFactory;

import designPatterns.abstractFactory.color.ColorFactory;
import designPatterns.abstractFactory.shape.ShapeFactory;

public class FactoryProducer {
	
	public static AbstractFactory getAbstractFactory(String choice){
		
		 if(choice.equalsIgnoreCase("SHAPE")){
	         return new ShapeFactory();
	         
	      }else if(choice.equalsIgnoreCase("COLOR")){
	         return new ColorFactory();
	      }
	      
	      return null;
		
	}

}
