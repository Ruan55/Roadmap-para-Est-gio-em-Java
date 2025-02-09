package Exercicios_Java;
import java.util.Scanner;

public class ex002 {

    public static void main(String[] args){

        Scanner idade = new Scanner(System.in);

        int idadePessoa;

        System.out.println("Digite a sua idade: ");
        idadePessoa = idade.nextInt();

        if(idadePessoa <= 12){

            System.out.println("Criança");

        }
        else if(idadePessoa >= 12 && idadePessoa <= 17){

            System.out.println("Adolescente");

        }
        else if(idadePessoa >= 18 && idadePessoa <= 59){

            System.out.println("Adulto");

        }
        else{

            System.out.println("Idoso");

        }

    }

}
