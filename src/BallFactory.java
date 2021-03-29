public class BallFactory implements AbstractFactory
{
    @Override
    public Gift createProduct() {
        return new Ball((int)(Math.random()*15));
    }
}
