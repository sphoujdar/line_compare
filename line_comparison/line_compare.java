package line_comparison;

public class line_compare {
		
		public static void is_line_equal(line line_1, line line_2) {
			
			//check length of both lines
			if (line_1.equals(line_2)) {
				System.out.println("Both lines are of Equal length.");
			}
			else {
				System.out.println("Lines are unequal.");
			}
			
		}
	
		public static void main(String[] args) {
			System.out.println("Welcome to Line Comparison Computation Program!");
		
			line line1 = new line(0,0,3,4);
			line line2 = new line(0,0,3,5);
			line1.print_line();
			line2.print_line();
			
			is_line_equal(line1, line2);
		
		}
}
