package line_comparison;

public class line {

	double x1 = 0 , y1 = 0 , x2 = 0 , y2 = 0;
	double length_of_line = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	public line(double x1, double y1, double x2, double y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		length_of_line = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	}
	
}
