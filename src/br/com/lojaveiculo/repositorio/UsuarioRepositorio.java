/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.lojaveiculo.repositorio;

import br.com.lojaveiculo.model.Usuario;
import java.util.List;

/**
 *
 * @author Matheus
 */
public interface UsuarioRepositorio {
    
    public List<Usuario> getUsuarios();
    public void adicionarUsuario(Usuario p);
    public Usuario buscaUsuario(String login);
    
}
