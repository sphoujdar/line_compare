package line_comparison;

public class line_compare {
		public static void main(String[] args) {
			System.out.println("Welcome to Line Comparison Computation Program!");
		
			line line1 = new line(0,0,3,4);
			
			System.out.printf("Points Provided - \nP1 [X1,Y1] = [%f,%f] \n"
					+ "P2 [X1,Y1] = [%f,%f] \n"
					+ "Length of provided Line is : %f \n",
					line1.x1, line1.y1, line1.x2, line1.y2, line1.length_of_line);
		
		}
}
