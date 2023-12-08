public class Triangle  extends  MainFigura implements  Drawble{
    private int  sidA, sidB, sidC;

    public Triangle(String name, int sidA, int sidB, int sidC) {
        super(name);
        this.sidA = sidA;
        this.sidB = sidB;
        this.sidC = sidC;
    }

    @Override
    public int calculateParemetr() {
        return sidA+sidB+ sidC;
    }

    public Triangle(String name) {
        super(name);
    }

    @Override
    public void Drawble() {
        System.out.println("\uD83D\uDD3A");
    }
}
