package designPatterns.abstractFactory;

import designPatterns.abstractFactory.color.iColor;
import designPatterns.abstractFactory.shape.iShape;

public abstract class AbstractFactory {
	
	public abstract iShape getShape(String name);
	public abstract iColor getColor(String name);

}
