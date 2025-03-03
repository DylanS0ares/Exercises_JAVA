package academy.devdojo.maratonajava.academy.devdojo.maratonajava.Lista_logica_programacao.src.domain;

import org.w3c.dom.ls.LSOutput;

public class Exercise13 {
    private String nome;
    private int idade;

    public Exercise13(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return this.nome + " é " + (this.idade >= 18 ? "Maior de idade" : "Menor de idade");

    }
}
