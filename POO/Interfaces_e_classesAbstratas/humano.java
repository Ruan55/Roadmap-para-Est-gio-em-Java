package POO.Interfaces_e_classesAbstratas;

public class humano implements ser_vivo1 {

    @Override
    public void respirar() {
        System.out.println("Respirando");
    }

    @Override
    public void andar() {
        System.out.println("Andando");
    }

    @Override
    public void comer() {
        System.out.println("Comendo");
    }
}
