package designPatterns.abstractFactory.shape;

import designPatterns.abstractFactory.AbstractFactory;
import designPatterns.abstractFactory.color.iColor;

public class ShapeFactory extends AbstractFactory{

	@Override
	public iShape getShape(String shape) {

		if (shape.equalsIgnoreCase("circle")) {
			return new Circle();
		} else if (shape.equalsIgnoreCase("square")) {
			return new Square();
		} else if (shape.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}

		return null;
	}

	@Override
	public iColor getColor(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
