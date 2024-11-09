import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Out.println("Hello, World!");

        double x;
        double y;
        double abstand;

        Out.print("X Koordinate: ");
        x = In.readDouble();

        Out.print("Y Koordinate: ");
        y = In.readDouble();

        abstand = Math.sqrt(x * x + y * y);

        if (x > 0 && y > 0) {
            if (abstand > 4 && x <= 4 && y <= 4) {
                Out.print("Der Punkt liegt innerhalb der grünen Zone!");
            }
        } else {
            Out.print("Der Punkt liegt außerhalb der grünen Zone!");
        }

    }
}
