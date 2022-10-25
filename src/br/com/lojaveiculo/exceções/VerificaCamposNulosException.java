package br.com.lojaveiculo.exceções;

public class VerificaCamposNulosException extends Exception {

    public VerificaCamposNulosException() {
        super("Preencha todos os campos");

    }
}
