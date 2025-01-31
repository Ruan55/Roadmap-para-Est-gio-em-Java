package POO.Conceitos_iniciais;

// Class: Modelo que define as características de um tipo de objeto
class Pessoa{

    String nome; // Atributo: Variáveis que definem as características de um objeto
    int idade; // Atributo


    // Construtor: Métodos que inicializam os objetos de uma classe
    public Pessoa(String nome, int idade){

        this.nome = nome;
        this.idade = idade;

    }

    // Métodos: É um paradigma de programação que organiza o código em torno de objetos.
    public void apresentar(){

        System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos de idade ");

    }

}

// Class: Modelo que define as características de um tipo de objeto
class Calculadora{

    int primeiroNumero; // Atributo: Variáveis que definem as características de um objeto
    int segundoNumero; // Atributo: Variáveis que definem as características de um objeto

    // Construtor: Métodos que inicializam os objetos de uma classe
    public Calculadora(int primeiroNumero, int segundoNumero){

        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;

    }

    // Métodos: É um paradigma de programação que organiza o código em torno de objetos.
    public void calcular(){

        System.out.println(primeiroNumero / segundoNumero);

    }

}

// Class: Modelo que define as características de um tipo de objeto
public class poo_conceitos_iniciais {

    public static void main(String[] args){

        // Criando um objeto: Um objeto é uma unidade que representa uma entidade do mundo real
        Pessoa pessoa1 = new Pessoa("Ruan", 22);

        // Criando um objeto: Um objeto é uma unidade que representa uma entidade do mundo real
        Calculadora calculadora1 = new Calculadora(10, 10);

        pessoa1.apresentar(); // Chamando os métodos
        calculadora1.calcular(); // Chamando os métodos

    }

}
