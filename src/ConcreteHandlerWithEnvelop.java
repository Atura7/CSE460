
public class ConcreteHandlerWithEnvelop implements Handler{
	
	private Handler successor; 
	
	public ConcreteHandlerWithEnvelop() {
		System.out.println("I am a ConcreteHandlerBox, I am just born"); 
	}
	
	public void setSuccessor(Handler handler) { successor = handler; } 
	
	@Override 
	public void handleRequest(Gift gift) {
		System.out.println("I am a ConcreteHandlerEnvelop, this is my handleRequest method working");
		System.out.println("- I put gifts in Envelops");
		if (gift.getSize() < 5 ) {
			Envelop envelop = new Envelop(); 
			envelop.add(gift); 
			System.out.println("- I create a new Envelop for a gift as follows:"); 
			envelop.print(); 
		}
		else {
			System.out.println("- This gift is NOT for an Envelop, passing it to the next Handler ..."); 
			successor.handleRequest(gift);
		}
	}
}
