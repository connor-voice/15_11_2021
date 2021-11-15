package exceptions;

public class DumbException extends Exception {

	public void exceptionNoZero() {
		System.out.println("You can't divide by zero");
	}
	
	public void exceptionItself() {
		System.out.println("Please don't divide an answer by itself, you already know the answer is 1");
	}
	
	public void exceptionGreater() {
		System.out.println("You can't divide by a number larger than itself in this circumstance buddy");
	}
}
