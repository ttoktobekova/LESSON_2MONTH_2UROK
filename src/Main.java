import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Tриуголник", 5, 5, 3);
        Square square = new Square("Квадрат", 5);
        Restengle restengle = new Restengle("Прямоуголник", 10, 20);
        Circle circle = new Circle("Круг", 50);

        Dog dog = new Dog("Rexs");
        Cat cat = new Cat("Pit");

        Drawble[] drawbles = {triangle, square, restengle, circle, cat, dog};
        for (int i = 0; i < drawbles.length; i++) {
            if (drawbles[i] instanceof MainFigura) {
                System.out.println(((MainFigura) drawbles[i]).getName() + " Переметр  ровно--->" + ((MainFigura) drawbles[i]).calculateParemetr());

            }
            if (drawbles[i] instanceof Animal) {
                System.out.println(((Animal) drawbles[i]).getName());
            }
            drawbles[i].Drawble();
        }

    }
}