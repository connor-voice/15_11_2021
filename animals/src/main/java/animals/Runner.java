package animals;

public class Runner {

	public static void main(String[] args) {
		
		Penguin pingu = new Penguin();
		Cat lily = new Cat();
		Dog molly = new Dog();
		Bird willis = new Bird();
		
		
		
		pingu.doSound("hello yes I am a penguin");
		pingu.doFishing();
		pingu.doThing("I have happy feet");
		pingu.eggSit();
		pingu.printHome("Antarctica");
		
		lily.doSound("purr");
		lily.doThing("I laid around");
		lily.knockOffEdge();
		lily.printHome("Lots of countries, many of me in Turkey");
		
		molly.barkAtDoor();
		molly.doSound("Woof Woof");
		molly.doThing("I chased my tail");
		molly.printHome("Lots of countries, especially Brazil");
		
		willis.doSound("kra kraaa");
		willis.whistleInShower();
		willis.throwStuff();
		willis.printHome("Mainly hot countries");
	}
	
}
