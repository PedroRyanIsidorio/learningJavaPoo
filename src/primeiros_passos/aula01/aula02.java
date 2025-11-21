package primeiros_passos.aula01;
import java.util.Scanner;

public class aula02 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia = "";
        sc.close();

        switch (x) {
            case 1: dia = "domingo"; break;
            case 2: dia = "segunda"; break;
            case 3: dia = "terca"; break;
            case 4: dia = "quarta"; break;
            case 5: dia = "quinta"; break;
            case 6: dia = "sexta"; break;
            case 7: dia = "sabado"; break;
        }

        System.out.println(dia);

    }
}
