package main;

public class series {
    private String nome;
    private String plataforma;


    public series(String nome, String plataforma) {
        this.nome = nome;
        this.plataforma = plataforma;
    }

    public series(String nome) {
        this.nome = nome;
        this.plataforma = "plataforma indefenida";
    }
}



