package exceptions;

public class Maths {
	
	public void doMeme(int a, int b) throws TwentyOneException {
		
		if (a == 9 && b == 10) {
			TwentyOneException toe = new TwentyOneException();
			throw toe;
		}
		
		int answer = a + b;
		System.out.println("The sum of your two numbers is: " + answer);
	}
	
	public void doDivision(int a, int b) throws DumbException {
		DumbException de = new DumbException();
		if (a == 0 || b == 0 ) {
			throw de;
		}
		if (a == b) {
			throw de;
		}
		if (a < b) {
			throw de;
		}
	}


}
