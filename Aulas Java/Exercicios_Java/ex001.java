package Exercicios_Java;
import java.util.Scanner;

public class ex001 {

    public static void main(String[] args){

        Scanner numero = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;

        System.out.println("Digite o primeiro número: ");
        primeiroNumero = numero.nextInt();

        System.out.println("Digite o segundo número: ");
        segundoNumero = numero.nextInt();

        System.out.println(primeiroNumero + segundoNumero);
        System.out.println(primeiroNumero * segundoNumero);

    }

}
