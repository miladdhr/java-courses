package generic_exercise;

public class Square extends Shape {
	
	public Square(double district) {
		super();
		this.district = district;
	}

	private double district;

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return district*district;
	}

	@Override
	public double Perimeter() {
		// TODO Auto-generated method stub
		return 4*district;
	}



	
}
