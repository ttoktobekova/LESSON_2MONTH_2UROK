public class Dog extends Animal implements  Drawble{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void Drawble() {
        System.out.println("\uD83D\uDC36");
    }
}
