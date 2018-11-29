package mathsThing;

import java.util.ArrayList;

public class MathsThing {

	public ArrayList<String> mainResults = new ArrayList<String>();
	
	public int addition(int first, int second, int third) {
		
		//ArrayList<Integer> results = new ArrayList<Integer>();
		
		if(first + second == third) {
			String x =Integer.toString(first)+ " + " + Integer.toString(second) + " = " + Integer.toString(third);
			//results.add(third);
			mainResults.add(x);
			return third; 
		}
		if(second + third == first) {
			String x =Integer.toString(second)+ " + " + Integer.toString(third) + " = " + Integer.toString(first);
			//results.add(first);
			mainResults.add(x);
			return first;
		}
		if(first + third == second) {
			String x =Integer.toString(first)+ " + " + Integer.toString(third) + " = " + Integer.toString(second);
			//results.add(second);
			mainResults.add(x);

			return second;  
		}//
		
		//return results;
		return 0; 
	}
	
	public ArrayList<Integer> subtraction(int first, int second, int third) {

		ArrayList<Integer> results = new ArrayList<Integer>();
		
		if(first - second == third) {
			String x =Integer.toString(first)+ " - " + Integer.toString(second) + " = " + Integer.toString(third);
			results.add(third);
			mainResults.add(x);
		}
		if(second - third == first) {
			String x =Integer.toString(second)+ " - " + Integer.toString(third) + " = " + Integer.toString(first);
			results.add(first);
			mainResults.add(x);
		}
		if(first - third == second) {
			String x =Integer.toString(first)+ " - " + Integer.toString(third) + " = " + Integer.toString(second);
			results.add(second);
			mainResults.add(x);
		}//
		if(second - first == third) {
			String x =Integer.toString(second)+ " - " + Integer.toString(first) + " = " + Integer.toString(third);
			results.add(third);
			mainResults.add(x);
		}
		if(third - second == first) {
			String x =Integer.toString(third)+ " - " + Integer.toString(second) + " = " + Integer.toString(first);
			results.add(first);
			mainResults.add(x);
		}
		if(third - first == second) {
			String x =Integer.toString(third)+ " - " + Integer.toString(first) + " = " + Integer.toString(second);
			results.add(second);
			mainResults.add(x);
		}
		
		return results;
		
	}

	public ArrayList<Integer> division(int first, int second, int third) {

		ArrayList<Integer> results = new ArrayList<Integer>();
		
		if(first / second == third) {
			String x =Integer.toString(first)+ " / " + Integer.toString(second) + " = " + Integer.toString(third);
			results.add(third);
			mainResults.add(x);
		} 
		if(second / third == first) {
			String x =Integer.toString(second)+ " / " + Integer.toString(third) + " = " + Integer.toString(first);
			results.add(first);
			mainResults.add(x);
		}
		if(first / third == second) {
			String x =Integer.toString(first)+ " / " + Integer.toString(third) + " = " + Integer.toString(second);
			results.add(second);
			mainResults.add(x);
		}//
		if(second / first == third) {
			String x =Integer.toString(second)+ " / " + Integer.toString(first) + " = " + Integer.toString(third);
			results.add(third);
			mainResults.add(x);
		}
		if(third / second == first) {
			String x =Integer.toString(third)+ " / " + Integer.toString(second) + " = " + Integer.toString(first);
			results.add(first);
			mainResults.add(x);
		}
		if(third / first == second) {
			String x =Integer.toString(third)+ " / " + Integer.toString(first) + " = " + Integer.toString(second);
			results.add(second);
			mainResults.add(x);
		}
		
		return results;
	}
	
	public ArrayList<Integer> multiply(int first, int second, int third) {

		ArrayList<Integer> results = new ArrayList<Integer>();
		
		if(first * second == third) {
			String x =Integer.toString(first)+ " * " + Integer.toString(second) + " = " + Integer.toString(third);
			results.add(third);
			mainResults.add(x);
		}
		if(second * third == first) {
			String x =Integer.toString(second)+ " * " + Integer.toString(third) + " = " + Integer.toString(first);
			results.add(first); 
			mainResults.add(x);
		}
		if(first * third == second) {
			String x =Integer.toString(first)+ " * " + Integer.toString(third) + " = " + Integer.toString(second);
			results.add(second);
			mainResults.add(x);
		}
		
		return results;
	}
	
	
}


