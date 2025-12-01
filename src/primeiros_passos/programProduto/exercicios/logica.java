package primeiros_passos.programProduto.exercicios;
//import java.util.Scanner;


public class logica {

    public static void main(String[] args){

        //Scanner sc = new Scanner(System.in);

        for(int i=1;i<=50;i++){
            if(((i%3)==0)&&((i%5)==0)){
                System.out.println("brisanet");
            }else if((i%3)==0){
                System.out.println("Brisa");
            }else if((i%5)==0){
                System.out.println("net");
            }
        }
    }
}
