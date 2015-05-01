package designPatterns.abstractFactory.color;

import designPatterns.abstractFactory.AbstractFactory;
import designPatterns.abstractFactory.shape.iShape;

public class ColorFactory extends AbstractFactory {

	@Override
	public iColor getColor(String name) {
		if (name.equalsIgnoreCase("green")) {
			return new Green();
		} else if (name.equalsIgnoreCase("red")) {
			return new Red();
		} else if (name.equalsIgnoreCase("blue")) {
			return new Blue();
		}
		return null;
	}

	@Override
	public iShape getShape(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
