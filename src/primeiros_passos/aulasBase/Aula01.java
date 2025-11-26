package primeiros_passos.aulasBase;
import java.util.Scanner;

// a = Math.sqrt(x); variavel A recebe a raiz quadrade de x
// a = Math.pow(x, y); variavel a recebe o resultado de x elevado a y
// a = Math.abs(x); Variavel A recebe o valor absoluto de x

public class Aula01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("raid quadrade de a+b: "+Math.sqrt(a+b));
        System.out.println("a elevado a b: "+Math.pow(a,b));
        System.out.println("valor absoluto de a: "+Math.abs(a));
    }
}