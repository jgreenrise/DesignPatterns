package designPatterns.abstractFactory;

import designPatterns.abstractFactory.color.iColor;
import designPatterns.abstractFactory.shape.iShape;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getAbstractFactory("SHAPE");

		// get an object of Shape Circle
		iShape shape1 = shapeFactory.getShape("CIRCLE");

		// call draw method of Shape Circle
		shape1.draw();

		// get an object of Shape Rectangle
		iShape shape2 = shapeFactory.getShape("RECTANGLE");

		// call draw method of Shape Rectangle
		shape2.draw();

		// get an object of Shape Square
		iShape shape3 = shapeFactory.getShape("SQUARE");

		// call draw method of Shape Square
		shape3.draw();

		// get color factory
		AbstractFactory colorFactory = FactoryProducer.getAbstractFactory("COLOR");

		// get an object of Color Red
		iColor color1 = colorFactory.getColor("RED");

		// call fill method of Red
		color1.fill();

		// get an object of Color Green
		iColor color2 = colorFactory.getColor("Green");

		// call fill method of Green
		color2.fill();

		// get an object of Color Blue
		iColor color3 = colorFactory.getColor("BLUE");

		// call fill method of Color Blue
		color3.fill();

	}

}
