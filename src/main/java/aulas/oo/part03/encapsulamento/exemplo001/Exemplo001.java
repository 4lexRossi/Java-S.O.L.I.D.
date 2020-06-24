package aulas.oo.part03.encapsulamento.exemplo001;

public class Exemplo001 {

    public static void main(String[] args) {

        Pessoa eu = new Pessoa("Alex", 10, 03, 1986);

        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.calculaIdade());

        eu.setNome("Alex Rossi");

        System.out.println(eu.getNome());

    }
}
