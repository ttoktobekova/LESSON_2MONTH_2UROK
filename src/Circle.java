public class Circle   extends  MainFigura implements Drawble{
    private  int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public int calculateParemetr() {
        return (int) (2*Math.PI * radius);
    }


    @Override
    public void Drawble() {
        System.out.println(" ⭕");
    }
}
