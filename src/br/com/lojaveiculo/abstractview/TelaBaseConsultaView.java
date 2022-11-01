/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.abstractview;

import br.com.lojaveiculo.model.Carro;
import br.com.lojaveiculo.model.Funcionario;
import br.com.lojaveiculo.model.Moto;
import br.com.lojaveiculo.model.Pessoa;
import br.com.lojaveiculo.model.Veiculo;
import br.com.lojaveiculo.model.Venda;
import br.com.lojaveiculo.repositorio.PadraoRepositorio;
import br.com.lojaveiculo.repositorio.PessoaRepositorio;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;
import br.com.lojaveiculo.repositorio.VendaRepositorio;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matheus
 */
public class TelaBaseConsultaView extends TelaBaseView {

    public TelaBaseConsultaView() {
        initComponents();
    }

    // Método que é sobrescrito para abrir as telas de cadastro em qualquer tela de consulta
    public void abrirTelaCadastro(){
        
    }

    // Método que é sobrescrito para abrir a tela de cadastro com as informações do item à alterar
    public void abrirTelaAlterarCadastro(Object obj){   
    }

    // Métodos comuns para manipulação da tabela na tela de consultas
    public void limpaSelecao(JTable tabela){
        tabela.clearSelection();
    }

    public void popularTabela(PadraoRepositorio repositorio, int tipoRepositorio, JTable tabela, DefaultTableModel grid){
        limparTabela(grid);
        switch (tipoRepositorio){
            // Case: tabela de clientes
            case 0 -> { 
                PessoaRepositorio repositorioDePessoas = (PessoaRepositorio) repositorio;
                tabela.getModel();
                for (Pessoa client : repositorioDePessoas.getClientes()) {
                    grid.addRow(client.obterDados());
                }
            }
            // Case: tabela de carros
            case 1 -> {
                VeiculoRepositorio repositorioDeVeiculos = (VeiculoRepositorio) repositorio;
                Map<String, Veiculo> veiculos = repositorioDeVeiculos.getVeiculos();
        
                for(Map.Entry<String, Veiculo> entry : veiculos.entrySet()){
                    if(entry.getValue() instanceof Carro carro){
                        grid.addRow(carro.obterDados());
                    }
                }
            }
            // Case: tabela de motos
            case 2 -> {
                VeiculoRepositorio repositorioDeVeiculos = (VeiculoRepositorio) repositorio;
                Map<String, Veiculo> veiculos = repositorioDeVeiculos.getVeiculos();
        
                for(Map.Entry<String, Veiculo> entry : veiculos.entrySet()){
                    if(entry.getValue() instanceof Moto moto){
                        grid.addRow(moto.obterDados());
                    }
                }
            }
            // Case: tabela de funcionários
            case 3 -> {
                PessoaRepositorio repositorioDePessoas = (PessoaRepositorio) repositorio;
                
                for (Pessoa func : repositorioDePessoas.getFuncionarios()) {
                    grid.addRow(func.obterDados());
                }
            }
            // Case 4: tabela de vendas
            case 4 -> {
                VendaRepositorio repositorioDeVendas = (VendaRepositorio) repositorio;
                
                for (Venda v : repositorioDeVendas.getVenda()) {
                    grid.addRow(v.obterDados());
                }
            }
        }
    }

    /*public void removerDaTabela(JTable tabela, DefaultTableModel grid, int lit){

    }*/

    // Ver com o professor se faz sentido ter uma sobrecarga de métodos aqui e chamar na tela específica.
    // Como segue o exemplo comentado abaixo.
    public void buscaNaTabela(String parametro){
        
    }
    
    public void limparTabela(DefaultTableModel grid){
        grid.setRowCount(0);
    }

    public int criaQuestaoPrgunta(String mensagem, String titulo){
        return JOptionPane.showConfirmDialog(rootPane, mensagem, titulo, WIDTH);
    }
  
    @Override
    public void apresentaMensagem(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(rootPane, mensagem, titulo, HEIGHT);
    }

    @Override
    public void organizaLayout() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
