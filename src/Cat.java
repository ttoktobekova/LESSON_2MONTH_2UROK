public class Cat extends  Animal implements  Drawble{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void Drawble() {
        System.out.println("\uD83D\uDE3A");

    }
}
