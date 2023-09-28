package org.example;

public class Fatura extends Departamento {
    private static Fatura fatura = new Fatura();

    private Fatura() {};

    public static Fatura getInstancia() {
        return fatura;
    }
}
