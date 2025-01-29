package ArrayList;
import java.util.ArrayList;

public class array_list {

    public static void main(String[] args){

        // Implementando uma lista de nomes
        ArrayList<String> nomes = new ArrayList<>();
        // Adicionando elementos a lista
        nomes.add("Pessoa1");
        nomes.add("Pessoa2");
        nomes.add("Pessoa3");
        nomes.add("Pessoa4");
        nomes.add("Pessoa5");

        // System.out.println(nomes.get(0));

        // Removendo um elemento da lista
        nomes.remove(0);

        // Exibindo o novo elemento herdeiro da posição inicial
        System.out.println(nomes.get(0));

    }

}
