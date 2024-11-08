package generic_exercise;

public  class ShapeUtills {

	public static < S extends Shape > double[] calculateTotall(S[] objs) {
	
		double[] result = new double[2];
		
		for(S obj: objs) {
			
			result[0] += obj.Area();
			result[1] += obj.Perimeter();
			
		}
		
		return result;
		
	}
	
}
