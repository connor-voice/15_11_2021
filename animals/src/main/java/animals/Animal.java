package animals;

public class Animal implements Home {
	
	private boolean isfurry;
	private boolean isGoodBoy;
	private int numPaws;
	
	
	public void doSound(String sound) {
		System.out.println(sound);
	}
	
	public void doThing(String thing) {
		System.out.println("I did a basic thing");
	}

	public void printHome(String home) {
		System.out.println(home);
	}

}
