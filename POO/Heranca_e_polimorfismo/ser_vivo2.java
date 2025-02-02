package POO.Heranca_e_polimorfismo;

// Classe Abstrata: é uma classe que não pode ser instanciada, mas que serve como base para outras classes.
public abstract class ser_vivo2 {

    protected int idade;

    public ser_vivo2(int idade){

        this.idade = idade;

    }

    public abstract void respirar();


    public void dormir(){

        System.out.println("Dormindo");

    }

    public static void main(String[] args){



    }

}
