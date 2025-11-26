package primeiros_passos.aulasPoo;
import java.util.Scanner;
import java.util.Locale;

//introdução a orientaçao a objetos.

public class AreaDoTriangulo {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of trinangle X: ");

        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures of trinangle Y: ");

        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA+xB+xC)/2;

        double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));

        double yp = (yA+yB+yC)/2;

        double areaY = Math.sqrt(yp*(yp-yA)*(yp-yB)*(yp-yC));

        if(areaX>=areaY){
            System.out.println("o maior triangulo é o X!");
        }else{
            System.out.println("o maior triangulo é o Y!");
        }

        System.out.println("A área do tringulo X é: "+areaX);
        System.out.println("A área do tringulo Y é: "+areaY);



// a = Math.sqrt(x); variavel A recebe a raiz quadrade de x
// a = Math.pow(x, y); variavel a recebe o resultado de x elevado a y
// a = Math.abs(x); Variavel A recebe o valor absoluto de x

        sc.close();
    }
}
