package Estruturas_condicionais;

public class estruturas_condicionais {

    public static void main(String[] args){

        // Declaração de variáveis
        byte idade = 70;

        // Verificando a compatibilidade da idade para o alistamento
        if(idade >= 18 && idade <= 65){

            System.out.println("Já pode se alistar!");

        }

        else if(idade >= 65){

            System.out.println("Você esta isento do alistamento!");

        }

        else{

            System.out.println("Ainda é novo demais para o alistamento!");

        }

    }

}
