
public class Quiz3 {

	private double side1;
	private double side2;
	private double side3;
	
	Quiz3(){
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	Quiz3(double x, double y, double z) throws Exception{
		if (x+y>z && x+z>y && y+z>x){
			side1 = x;
			side2 = y;
			side3 = z;
		}
		else throw new Exception();
	}
	
	public double getSide1(){
		return side1;
	}
	
	public double getSide2(){
		return side2;
	}
	
	public double getSide3(){
		return side3;
	}
	
	public double getPerimeter(){
		return side1+side2+side3;
	}
	
	public double getArea(){
		double p = getPerimeter()/2;
		double a = Math.sqrt(p * (p-side1) * (p-side2) * (p-side3));
		return a;
	}
	
	@Override
	public String toString(){
		return "Side 1 is " + side1 + ". Side 2 is " + side2 + "."
				+ " Side 3 is " + side3;
	}
}