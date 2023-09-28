package org.example;

public class Produto extends Departamento {
    private static Produto produto = new Produto();

    private Produto() {};

    public static Produto getInstancia() {
        return produto;
    }
}
