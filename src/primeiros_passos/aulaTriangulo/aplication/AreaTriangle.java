package primeiros_passos.aulaTriangulo.aplication;

public class AreaTriangle {
    public static double calcArea(double a, double b, double c){
        double p = (a+b+c)/2;
        return (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}
