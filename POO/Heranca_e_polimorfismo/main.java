package POO.Heranca_e_polimorfismo;

public class main {

    public static void main(String[] args){

        humano humano1 = new humano();
        peixe peixe1 = new peixe(33);

        peixe peixeMorto = null;

        // Tratamento de Exceções com Java
        try {
            peixeMorto.respirar();
        }catch (NullPointerException exception){
            System.out.println("Arrume outro peixe");
        }

    }

}
