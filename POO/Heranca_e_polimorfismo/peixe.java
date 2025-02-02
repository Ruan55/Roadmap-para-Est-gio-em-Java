package POO.Heranca_e_polimorfismo;

// Herança:  é a capacidade de uma subclasse de ter acesso as propriedades da superclasse(também chamada classe base) relacionada a esta subclasse.
public class peixe extends ser_vivo2{

    boolean pararDeRespirar;

    // é a capacidade de tratar objetos de classes diferentes de forma uniforme, desde que tenham uma interface comum ou uma classe base
    public peixe(int idade) {
        super(idade);
        this.pararDeRespirar = false;
    }

    @Override
    public void respirar() {

        if(pararDeRespirar){

            System.out.println("O peixe morreu");

        }
        else{

            System.out.println("Respirando pela água");

        }

    }

}
