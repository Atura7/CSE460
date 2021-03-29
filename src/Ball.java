public class Ball extends Gift
{
    public Ball(int size)
    {
        this.setSize(size);
        System.out.println("I am a Ball, I am just born with size = " + size);

    }

    @Override
    void print() {
        System.out.println("I am a Ball size = " + getSize()
        + ", this is my print method working");
    }
}
