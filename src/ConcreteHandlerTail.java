import java.util.Observable;

public class ConcreteHandlerTail extends Observable implements Handler{
	public ConcreteHandlerTail() {
		System.out.println("I am a ConcreteHandlerTail, I am just born");
	}
	
	public void handleRequest(Gift gift) {
		System.out.println("I am a ConcreteHandlerTail, this is my handleRequest method working");
		System.out.println("- This gift has wrong size: ");
		gift.print();
		setChanged();
		notifyObservers(); 
	}
}
