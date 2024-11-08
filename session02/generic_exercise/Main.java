package generic_exercise;

import java.util.Arrays;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Circle c =   new Circle(1.4);
		Square s =   new Square(5.5);
		
		System.out.println(c.Area());
		System.out.println(c.Perimeter());

		System.out.println(s.Area());
		System.out.println(	s.Perimeter());
		
	
		// ShapeUtils
		
		         Shape[] objs = {
//			         new Circle(1.0),
//			         new Circle(3.0),
			         new Square(3.0),
			         new Square(5.0)
			     };

		
		
		System.out.println(Arrays.toString(ShapeUtills.calculateTotall(objs)));
			
		
	}

}
