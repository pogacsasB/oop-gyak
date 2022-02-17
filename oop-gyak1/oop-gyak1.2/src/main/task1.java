package main;

public class task1 {

	public static void main(String[] args) {
		int a = 5;
		System.out.print("aasdasd");
		System.out.println(a + a + " is a number.");
		//double[] nums = wallis(100);
		
		printArray(leibnitz(a), a);
		
		printArray(wallis(a), a);
	}
	
	static double[] leibnitz(int max){
		double[] nums = new double[max];
		double current = 1;
		
		for (int i = 0; i < max; i++){
			double addendum = 1 / (double)(3 + i * 2);
			if (i % 2 == 0) {
				addendum *= -1;
			}
			current += addendum;
			nums[i] = current * 4;
		}
		
		return nums;
	}
	
	static double wallis (int max) {
		double[] nums = new double[max];
		double current = 1;
		double divisor = 1, multiplier = 2;
		
		for (int i = 0; i < max; i++) {
			current = multiplier / divisor;
			if (i % 2 == 0) {
				divisor += 2;
			}
			else {
				multiplier += 2;
			}
			nums[i] = current;
		}
	}
	
	static void printArray(double[] nums, int max) {
		System.out.println("Szamok:\n");
		for (int i = 0; i < max; i++) {
			
			System.out.println(nums[i]);
		}
	}

}
