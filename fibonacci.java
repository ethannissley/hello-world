package week2;

public class Fibonacci {
	public static void main(String [] args){
	    
		int num1 = 0;
		int num2 = 1;

		for (int i = 1; i <= 12; i++) {
		    
		    System.out.print(num2 + " ");
		    int nextNum = num1 + num2;
		    num1 = num2;
		    num2 = nextNum;
		    }
		}

}

