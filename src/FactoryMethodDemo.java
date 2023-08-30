
public class FactoryMethodDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ConcreteShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("rectangle");
		shape1.draw();
	}

}
