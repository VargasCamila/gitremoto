import java.util.Scanner;
public class Exercicio20{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        //Faça um programa que recebe a altura e o sexo de uma pessoa, 
        //calcule e imprima seu peso ideal, segundo as fórmulas
        //homens : (72.7 * H) – 58 
        //mulheres : (62.1 * H) – 44,7 

        String sexo;
        String Mulher;
        String Homem;
        String txtaltura;
        Float altura, PesoIdeal;


        Sistem.out.println("Digite sua altura");
        txtaltura = teclado.nextLine();
        altura = Integer.parseFloat(txtaltura);
        Sistem.out.println("Digite seu sexo");
        sexo = teclado.nextLine();

        if (sexo == Homem){
            PesoIdeal = (72.7f * altura) – 58;
            Sistem.out.println("Peso Ideal : "+PesoIdeal);

        }

        else (sexo == Mulher){
            PesoIdeal = (62.1f * altura) – 58;
            Sistem.out.println("Peso Ideal : "+PesoIdeal);
        }



    }
}