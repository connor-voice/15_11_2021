package animals;

public class Dog extends Animal implements Pet {

	private double earLength;
	private String name;
	private boolean hatesPostMan;
	
	public void walkies() {
		System.out.println("OH BOI I LOVE WALKIES");
	}
	
	public void barkAtDoor() {
		System.out.println("bork bork, the door is evil");
	}

	public void petSay() {
		System.out.println("I am a good boy pet");
	}
	
}
