public class ShapesMain {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Octagon(20);
		shapes[1] = new HexagonApp(10);
		
		for (int i = 0; i < shapes.length; i++ ) {
			System.out.println("Area = " + shapes[i].getArea() + 
			", perimeter = " + 
				shapes[i].getPerimeter());
			
		}

	}
	

}
