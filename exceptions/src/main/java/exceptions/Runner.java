package exceptions;

public class Runner {

	public static void main(String[] args) {
		Maths one = new Maths();

		try {
			one.doMeme(9, 10);
		} catch(TwentyOneException toe) {
			toe.showException();
		}
		
		try {
			one.doDivision(50, 0);
		} catch(DumbException de) {
			de.exceptionNoZero();
		}
		
		try {
			one.doDivision(50, 50);
		} catch (DumbException de) {
			de.exceptionItself();
		}
		
		try {
			one.doDivision(10, 50);
		} catch (DumbException de) {
			de.exceptionGreater();
		}
	}
}
