public class Box extends Decorator {
	public Box () {
		System.out.println("I am a Box, I am just born");
	}
	
	@Override
	public void print() {
		super.print();
		System.out.print("I am a Box, this is my print method working");
	}
}