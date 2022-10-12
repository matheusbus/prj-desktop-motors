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
        repositorioDePessoas.adicionarPessoa(new Vendedor(10.0, 2000, "Rafael", "12876163993", "(98) 3357-4626"));
        repositorioDePessoas.adicionarPessoa(new Gerente(8000.00, "Matheus", "18376412983", "(79) 3256-9225", "Financeiro"));
        repositorioDePessoas.adicionarPessoa(new Vendedor(12.0, 4000, "Eduardo", "18723465409", "(82) 3501-5376"));
        repositorioDePessoas.adicionarPessoa(new Vendedor(15.0, 5000, "Elisa Silveira", "59968114995", "(97) 3522-5866"));
        repositorioDePessoas.adicionarPessoa(new Vendedor(13.5, 6000, "Nicollas Nepomuceno Pinto Alentejo", "25516297648", "(63) 3233-4798"));
        repositorioDePessoas.adicionarPessoa(new Gerente(7000.00, "Yago Garbelini Teixeira Vaz", "14332847156", "(95) 2936-7851", "Administrativo"));
        repositorioDePessoas.adicionarPessoa(new Vendedor(15.0, 1600, "Lucas Felipe Figueiras Alfradique Carino", "69148632880", "(67) 3326-0230"));
        repositorioDePessoas.adicionarPessoa(new Vendedor(17.5, 2200, "Jhonas Carneiro Gualberto Conceição", "12445499593", "(87) 3323-5724"));
        repositorioDePessoas.adicionarPessoa(new Vendedor(22.0, 2500, "Rone Cretella Monnerat Belmiro", "67505462342", "(54) 2567-8074"));
        repositorioDePessoas.adicionarPessoa(new Vendedor(10.0, 2900, "Augusto Gouveia Mourão Corrêa", "04786841340", "(35) 2471-5577"));
        repositorioDePessoas.adicionarPessoa(new Vendedor(5.5, 2600, "Sandra Braz Mateus Barcelos", "62912457106", "(84) 3242-5950"));
        repositorioDePessoas.adicionarPessoa(new Gerente(15500, "Elenice Nespoli Latin Celestino", "19883542186", "(92) 2045-2818", "Recursos Humanos"));
        repositorioDePessoas.adicionarPessoa(new Vendedor(6.0, 4030, "Roseli Carvel Espindola Viana", "35941780133", "(61) 2417-7629"));
        repositorioDePessoas.adicionarPessoa(new Vendedor(7.5, 1800, "Silvio Prata de Lima Neto", "61325635804", "(65) 2951-9753"));
        repositorioDePessoas.adicionarPessoa(new Vendedor(8.0, 2300, "Ivone Pena dos Santos Chaves", "72482237432", "(44) 2759-6625"));
    }

     //Teste
    public void criaClientes() {
        repositorioDePessoas.adicionarPessoa(new Cliente("João Lucas Farias", "28716399312", "(69) 2327-1880"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Rafael Dalmarco", "37641298342", "(82) 2742-5572"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Eduardo Sangaletti", "18746540915", "(27) 3318-2804"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Matheus Buschermoehle", "52463590181", "(28) 3403-5566"));
        repositorioDePessoas.adicionarPessoa(new Cliente("João Lucas Farias", "45924056686", "(68) 2277-3282"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Pietro da Conceição", "24914665891", "(61) 2495-2764"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Sra. Daniela da Mota", "33006963563", "(91) 3559-1725"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Maria Sophia Cunha", "67148968240", "(28) 3716-9843"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Renan Barros", "39524532778", "(97) 3783-8310"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Milena Mendes", "97038843184", "(96) 2585-5135"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Maria Sophia da Mata", "18426463622", "(64) 3325-3289"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Pedro Sales", "74089551609", "(79) 3146-8889"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Mirella Araújo", "51456173308", "(97) 3957-1086"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Isabella da Rocha", "13586612192", "(24) 2381-6258"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Ana Vitória Farias", "57425425262", "(22) 3981-7757"));
        repositorioDePessoas.adicionarPessoa(new Cliente("João Vitor da Luz", "75249704557", "(69) 2311-9775"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Algemira Lana Vasconcellos Peixoto", "22155381476", "(42) 2954-8487"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Raul Barthon Temperini Amaral", "12779475463", "(99) 3546-6680"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Glauco Bocafoli Caruso Assis", "62740831110", "(48) 3840-2324"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Elaine Bilé Bezerra Zava", "83650080338", "(84) 2409-7572"));
        repositorioDePessoas.adicionarPessoa(new Cliente("José Maria Rios Santomauro Lourenço", "38644518097", "(48) 2352-7704"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Angela Prata Bilé Camara", "05340683915", "(27) 3712-3983"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Anne Nazare Teixeira Borges", "03774734305", "(82) 2411-4682"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Liliane Carmo Furtunato Castro", "32849015237", "(89) 2346-2487"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Myrian Paulo Fonseca Mesquita", "19267157485", "(51) 3264-0892"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Pedro Campos de Padua Pinho", "39815913727", "(43) 2085-8422"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Wellington Linhares Carneiro Gomes", "31776483529", "(49) 3412-4121"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Amanda Feitosa Figueiredo Abreu", "81435844297", "(61) 3506-5257"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Manuella Barsosa de Padua da Cunha", "87357881270", "(69) 3681-3507"));
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
