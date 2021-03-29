public class Main
{

        public static void main(String[] args) {
            // factory
            AbstractFactory factory = new BallFactory();
            // chain of responsibilities
            ConcreteHandlerWithBox handlerBox = new ConcreteHandlerWithBox();
            ConcreteHandlerWithEnvelop handlerEnvelop = new ConcreteHandlerWithEnvelop();
            ConcreteHandlerTail handlerTail = new ConcreteHandlerTail();
            handlerBox.setSuccessor(handlerEnvelop);
            handlerEnvelop.setSuccessor(handlerTail);
            // observer
            Supervisor supervisor = new Supervisor();
            handlerTail.addObserver(supervisor);

            for (int i = 0; i < 10; i++) {
                System.out.println("*** ITERATION: " + i );

                // manufacture a product
                Gift gift = factory.createProduct();
                gift.print();


                handlerBox.handleRequest(gift);
            }

            System.out.println("*** Production is Closed");
            supervisor.report();

        }
}
