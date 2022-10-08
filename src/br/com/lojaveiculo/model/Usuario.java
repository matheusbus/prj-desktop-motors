/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.model;

/**
 *
 * @author Matheus
 */
public class Usuario {
    
    private static int codigoGerado = 0;
    private int codigo;
    private String login;
    private String senha;

    public Usuario(String login, String senha) {
        this.codigo = codigoGerado++;
        this.login = login;
        this.senha = senha;
    }

    public static int getCodigoGerado() {
        return codigoGerado;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
