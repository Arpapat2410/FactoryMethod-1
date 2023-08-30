
public class ConcreteShapeFactory extends ShapeFactory {

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if("CIRCLE" .equalsIgnoreCase(shapeType)) {
			return new Circle();
		}else if ("RECTANGLE" .equalsIgnoreCase(shapeType)) {
			return new Rectangle();
		}else if ("TRIANGLE" .equalsIgnoreCase(shapeType)) {
			return new Triangle();
		}
		return null;
	}

}
