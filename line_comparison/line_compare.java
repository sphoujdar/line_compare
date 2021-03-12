package line_comparison;

public class line_compare {
		
		public static void compare_line_pair(line line_1, line line_2) {
			
			//check length of both lines
			if (line_1.equals(line_2)) {
				System.out.println("Both lines are of Equal length.");
			}
			else if (line_1.length_of_line > line_2.length_of_line){
				System.out.println("Line 1 is longer than Line 2");
			}
			else {
				System.out.println("Line 2 is longer than Line 1");
			}
			
		}
			
			
	
		public static void main(String[] args) {
			System.out.println("Welcome to Line Comparison Computation Program!");
			
			Point o = new Point(0, 0);
			Point a = new Point(3, 4);
			Point b = new Point(3, 5);
			
			line line1 = new line(o,a);
			line line2 = new line(o,b);
			
			
			System.out.println("Line 1 : ");
			line1.print_line();
			System.out.println("Line 2 : ");
			line2.print_line();
			
			compare_line_pair(line1, line2);
		
		}
}
