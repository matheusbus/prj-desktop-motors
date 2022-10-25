/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.dao;

import br.com.lojaveiculo.model.Usuario;
import br.com.lojaveiculo.repositorio.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class UsuarioDAO implements UsuarioRepositorio {

    private static List<Usuario> usuarios;

    public UsuarioDAO() {
        if (usuarios == null) {
            usuarios = new ArrayList<>();
        }
    }

    @Override
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    @Override
    public boolean adicionarUsuario(Usuario usu) {
        usuarios.add(usu);
        return true;
    }

    @Override
    public Usuario buscaUsuario(String login) {
        for (Usuario usu : usuarios) {
            if (usu.getLogin().equals(login)) {
                return usu;
            }
        }
        return null;
    }

}
