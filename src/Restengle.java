public class Restengle extends MainFigura implements  Drawble{
    private int sidOne;
    private int sidTwo;

    public Restengle(String name, int sidOne, int sidTwo) {
        super(name);
        this.sidOne = sidOne;
        this.sidTwo = sidTwo;
    }

    @Override
    public int calculateParemetr() {
        return (sidOne + sidTwo)*2;
    }


    @Override
    public void Drawble() {
        System.out.println(" \uD83D\uDFE9");
    }
}
