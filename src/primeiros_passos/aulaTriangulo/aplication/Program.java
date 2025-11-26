package primeiros_passos.aulaTriangulo.aplication;
import primeiros_passos.aulaTriangulo.entities.Triangle;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite os dados do tringulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite os dados do tringulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = AreaTriangle.calcArea(x.a, x.b, x.c);
        double areaY = AreaTriangle.calcArea(y.a, y.b, y.c);

        System.out.println("Area X: "+areaX);
        System.out.println("Area Y: "+areaY);

        sc.close();
    }
}
