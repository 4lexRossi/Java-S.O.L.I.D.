package aulas.oo.part02.construtores.exercicio;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class Veiculo {
    private String marca;
    private String modelo;
    private Integer ano;
    private String variante;

    public Veiculo(String marca, String modelo, Integer ano, String variante){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.variante = variante;
    }
}
