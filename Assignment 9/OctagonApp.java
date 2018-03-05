public class Octagon implements Shape {
	
	private double side1;
	
    public Octagon(double side1) {
    	this.side1 = side1;
    }
	
    // returns perimeter
    public double getPerimeter() {
    	return side1 * 8;
    }
    //returns area 
    public double getArea() {
    	//return  (2 + (4 / (Math.sqrt(2))) * side1 * side1); 
    	return (2 + 4 / Math.sqrt(2)) * side1 * side1;
    }
}
