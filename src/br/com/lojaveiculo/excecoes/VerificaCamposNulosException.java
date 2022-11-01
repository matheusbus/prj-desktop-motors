package br.com.lojaveiculo.excecoes;

public class VerificaCamposNulosException extends Exception {

    public VerificaCamposNulosException() {
        super("Preencha todos os campos");
    }
}
