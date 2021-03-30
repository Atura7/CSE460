
public class ConcreteHandlerWithBox implements Handler{
	
	private Handler successor; 
	
	public ConcreteHandlerWithBox() {
		System.out.println("I am a ConcreteHandlerBox, I am just born"); 
	}
	
	public void setSuccessor(Handler handler) {successor = handler;}
	
	@Override 
	public void handleRequest(Gift gift) {
		System.out.println("I am a ConcreteHandlerBox, this is my handleRequest method working");
		System.out.println("- I put gifts in Boxes");
		if(gift.getSize() > 10) {
			Box box = new Box(); 
			box.add(gift); 
			System.out.println("- I create a new Box for a gift as follows:"); 
			box.print();
		}
		else {
			System.out.println("- This gift is NOT for a Box, passing it to the next Handler ..."); 
			successor.handleRequest(gift);
		}
	}

}
