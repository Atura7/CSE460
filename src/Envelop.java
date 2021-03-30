public class Envelop extends Decorator {
	public Envelop() {
		System.out.println("I am an Envelop, I am just born");
	}

	@Override
	public void print() {
		super.print();
		System.out.println("I am an Envelop, this is my print method working");
	}
}