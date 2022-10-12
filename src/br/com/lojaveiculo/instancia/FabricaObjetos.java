/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.instancia;

import br.com.lojaveiculo.dao.PessoaDAO;
import br.com.lojaveiculo.dao.VeiculoDAO;
import br.com.lojaveiculo.model.Carro;
import br.com.lojaveiculo.model.Cliente;
import br.com.lojaveiculo.model.Gerente;
import br.com.lojaveiculo.model.Marca;
import br.com.lojaveiculo.model.Moto;
import br.com.lojaveiculo.model.Vendedor;
import br.com.lojaveiculo.repositorio.PessoaRepositorio;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;

/**
 *
 * @author Matheus
 */
public class FabricaObjetos {
    
    private PessoaRepositorio repositorioDePessoas;
    private VeiculoRepositorio repositorioDeVeiculos;
    
    public FabricaObjetos() {
        if(repositorioDePessoas == null){
            repositorioDePessoas  = new PessoaDAO();
        }
        if(repositorioDeVeiculos == null){
            repositorioDeVeiculos = new VeiculoDAO();
        }
    }
    
    //Teste
    public void criaFuncionarios() {
        repositorioDePessoas.adicionarPessoa(new Vendedor(10.0, 2000, "Rafael", "12876163993", "47987654321"));
        repositorioDePessoas.adicionarPessoa(new Gerente(8000.00, "Matheus", "18376412983", "4799876213", "Financeiro"));
        repositorioDePessoas.adicionarPessoa(new Vendedor(12.0, 4000, "Eduardo", "18723465409", "47965427123"));
    }

     //Teste
    public void criaClientes() {
        repositorioDePessoas.adicionarPessoa(new Cliente("Marcos", "287163993", "4798234321"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Gabriel", "376412983", "479546213"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Joao", "187465409", "4796576123"));
    }
    
    
    public void criaVeiculos(){
        repositorioDeVeiculos.addVeiculo(new Moto("ABC0001", "Biz 80", new Marca("Fiat"), 2008, 25000, "Gasolina", 80));
        repositorioDeVeiculos.addVeiculo(new Moto("ABC0002", "Biz 100", new Marca("Fiat"), 2010, 80000, "Gasolina", 120));
        repositorioDeVeiculos.addVeiculo(new Moto("ABC0003", "CG150", new Marca("Honda"), 2015, 12000, "Gasolina", 150));
        repositorioDeVeiculos.addVeiculo(new Moto("ABC0004", "CG200", new Marca("Honda"), 2018, 80000, "Gasolina", 200));
        repositorioDeVeiculos.addVeiculo(new Carro("MKQ8507", "CL-244 2.8 132cv 4x4 TB Int.", new Marca("Cross Lander"), 2003, 25000, "Diesel", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("LWR9396", "9000 CD 2.3 Turbo", new Marca("Saab"), 2002, 80000, "Diesel", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("MJE6388", "TOPIC FURGAO L 2.2 8V/ 2.0 16V 4p", new Marca("JINBEI"), 1992, 50000, "Gasolina", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("MBR4428", "Hilux CD SR 4x4 3.0 8V 90cv Diesel", new Marca("Toyota"), 2002, 40000, "Flex", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("MGU3473", "Defender 90 TDI Hard Top Diesel", new Marca("Land Rover"), 1996, 40000, "Gasolina", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("MEZ1270", "HOVER CUV 2.4 16V 5p Mec.", new Marca("GREAT WALL"), 2008, 40000, "Alcool", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("LZH3275", "SL-63 AMG 5.5 Bi-Turbo V8 Aut.", new Marca("Mercedes-Benz"), 2013, 40000, "Gasolina", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("MLL1094", "Wraith 6.6 V12 Aut.", new Marca("Rolls-Royce"), 2014, 40000, "Gasolina", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("MHE0503", "156 SportWagon 2.5 V6 24V 190cv 4p Aut.", new Marca("Alfa Romeo"), 2003, 40000, "Alcool", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("MMD3744", "Pick-Up 4x2 Curto/Longo 2.5 TDI Diesel", new Marca("Matra"), 2002, 40000, "Gasolina", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("LZH7265", "Outback 3.0 H6 SW 245cv Aut.", new Marca("Subaru"), 2004, 40000, "Gasolina", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("LYN0101", "Grand Siena ATTRAC. 1.4 EVO F.Flex 8V", new Marca("Fiat"), 2002, 40000, "Flex", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("MJE5467", "F599 GTB Fiorano F1 6.0 V12 620cv", new Marca("Ferrari"), 2007, 400000, "Flex", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("MII7048", "PT Cruiser Limited 2.0 16V 4p", new Marca("Fiat"), 2001, 40000, "Alcool", 7));
        repositorioDeVeiculos.addVeiculo(new Carro("MCB0839", "155 Super", new Marca("Alfa Romeo"), 1995, 40000, "Flex", 7));
        repositorioDeVeiculos.addVeiculo(new Carro("MJF5888", "Carnival EX 3.8 V6 24V 242cv Aut.", new Marca("Kia Motors"), 2006, 40000, "Gasolina", 7));
        repositorioDeVeiculos.addVeiculo(new Carro("MJB2287", "Quattroporte Automatica 4.2 32V 400cv", new Marca("Maserati"), 2008, 40000, "Alcool", 7));
        repositorioDeVeiculos.addVeiculo(new Carro("MMM0009", "911 Carrera Coup", new Marca("Porsche"), 1992, 40000, "Flex", 7));
        repositorioDeVeiculos.addVeiculo(new Carro("MEU6423", "Gallardo Coupe LP560-4", new Marca("LAMBORGHINI"), 2010, 40000, "Gasolina", 7));
    }
    
}
