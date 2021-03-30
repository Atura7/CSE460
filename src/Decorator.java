abstract class Decorator extends Gift {
	protected Gift component;

	public void add(Gift component) {
		this.component = component;
	}

	@Override
	public void print() {
		if (component != null) {
			component.print();
		}
	}
}