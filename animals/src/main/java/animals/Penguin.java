package animals;

public class Penguin extends Animal {

	private int flippers = 2;
	private boolean doesIceFishing;
	
	public void doFishing() {
		System.out.println("I have gone fishing");
	}
	
	public void eggSit() {
		System.out.println("I am sitting on an egg until it hatches");
	}
	
}
