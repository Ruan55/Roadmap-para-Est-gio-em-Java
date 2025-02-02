package POO.Heranca_e_polimorfismo;

// Herança:  é a capacidade de uma subclasse de ter acesso as propriedades da superclasse(também chamada classe base) relacionada a esta subclasse.
public class humano extends ser_vivo2{

    public String nome;

    public humano() {
        super(22);
        this.nome = "Ruan";

    }

    @Override
    public void respirar() {
        System.out.println(this.idade);
        System.out.println("Respirando Infinitamente");
    }
}
