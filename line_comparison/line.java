package line_comparison;

public class line {

	double x1 = 0 , y1 = 0 , x2 = 0 , y2 = 0;
	double length_of_line = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	public line(Point point1 , Point point2) {
		super();
		this.x1 = point1.x1;
		this.y1 = point1.y1;
		this.x2 = point2.x1;
		this.y2 = point2.y1;
		length_of_line = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	}
	
	public void print_line() {
		System.out.printf("Points provided - \nP1 [X1,Y1] = [%f,%f] \n"
				+ "P2 [X2,Y2] = [%f,%f] \n"
				+ "Length of provided Line is : %f \n",
				this.x1, this.y1, this.x2, this.y2, this.length_of_line);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		line other = (line) obj;
		if (Double.doubleToLongBits(length_of_line) != Double.doubleToLongBits(other.length_of_line))
			return false;
		
		return true;
	}
	
	
	
	
	
}
