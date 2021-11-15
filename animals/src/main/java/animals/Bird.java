package animals;

public class Bird extends Animal implements Pet {

	private String colours;
	private boolean repeatPhrases;

	public void whistleInShower() {
		System.out.println("*whistling to don't worry be happy*");
	}

	public void throwStuff() {
		System.out.println("If you give me a cup I'll throw it for you");
	}

	public void petSay() {
		System.out.println("I can sometimes be a pet");
	}

}
