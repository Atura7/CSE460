import java.util.Observable;
import java.util.Observer; 

public class Supervisor implements Observer {
	private int counter; 
	
	public Supervisor() { System.out.println("I am a Supervisor, I am just born"); }
	
	@Override 
	public void update(Observable o, Object arg) {
		counter++; 
	}
	
	public void report() {
		System.out.println("I am a Supervisor, reporting a total of " + counter + " errors"); 
	}
}
