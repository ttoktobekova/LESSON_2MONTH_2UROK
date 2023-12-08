public class Square extends  MainFigura implements Drawble {
    private int side;

    public Square(String name, int side) {
        super(name);
        this.side = side;
    }

    @Override
    public int calculateParemetr() {
        return  side *4;
    }

    public Square(String name) {
        super(name);
    }

    @Override
    public void Drawble() {
        System.out.println("◼\uFE0F\uFE0F");
    }
}
