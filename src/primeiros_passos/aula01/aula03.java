package primeiros_passos.aula01;

import java.util.Scanner;

public class aula03 {

    public static void main(String[] args){
        //Scanner sc = new Scanner();

        String original = "Abcd Fthsh lqlalsldl SLSKSK";

        // #.replace(x, a) ele troca todos os caracters x por a.
        // #.indexOf("bc"), ele retorna o indice em inteiro da posiçao da primeira vez que ele achar bc
        // #.lastIndexOf("bc"), ele retorna o indice em inteiro da ultima posicao que ele achar bc
        // #String[] vect = x.split(""); ele separa todos os caracters que possuam espaçoes entre eles e os transforma em indices do vetor


        System.out.println("toLowerCase: "+original.toLowerCase());
        System.out.println("toUpperCase: "+original.toUpperCase());
        System.out.println("trim: "+original.trim());
        System.out.println("substring(2): "+original.substring(2));
        System.out.println("substring(2, 9): "+original.substring(2, 9));
    }
}
