/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.instancia;

import br.com.lojaveiculo.dao.PessoaDAO;
import br.com.lojaveiculo.dao.UsuarioDAO;
import br.com.lojaveiculo.dao.VeiculoDAO;
import br.com.lojaveiculo.dao.VendaDAO;
import br.com.lojaveiculo.model.Carro;
import br.com.lojaveiculo.model.Cliente;
import br.com.lojaveiculo.model.Gerente;
import br.com.lojaveiculo.model.Marca;
import br.com.lojaveiculo.model.Moto;
import br.com.lojaveiculo.model.Usuario;
import br.com.lojaveiculo.model.Venda;
import br.com.lojaveiculo.model.Vendedor;
import br.com.lojaveiculo.repositorio.PessoaRepositorio;
import br.com.lojaveiculo.repositorio.UsuarioRepositorio;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;
import br.com.lojaveiculo.repositorio.VendaRepositorio;

/**
 *
 * @author Matheus
 */
public class FabricaObjetos {

    private PessoaRepositorio repositorioDePessoas;
    private VeiculoRepositorio repositorioDeVeiculos;
    private VendaRepositorio repositorioDeVendas;
    private UsuarioRepositorio repositorioDeUsuarios;

    public FabricaObjetos() {
        if (repositorioDePessoas == null) {
            repositorioDePessoas = new PessoaDAO();
        }
        if (repositorioDeVeiculos == null) {
            repositorioDeVeiculos = new VeiculoDAO();
        }
        if (repositorioDeVendas == null) {
            repositorioDeVendas = new VendaDAO();
        }
        if (repositorioDeUsuarios == null) {
            repositorioDeUsuarios = new UsuarioDAO();
        }
    }
       
    public void criaUsuarios(){
        repositorioDeUsuarios = new UsuarioDAO();
        repositorioDeUsuarios.adicionarUsuario(new Usuario("Rafael", "rafa123"));
        repositorioDeUsuarios.adicionarUsuario(new Usuario("Eduardo", "edu123"));
        repositorioDeUsuarios.adicionarUsuario(new Usuario("Matheus", "math123"));
        repositorioDeUsuarios.adicionarUsuario(new Usuario("admin", "admin"));
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
        //repositorioDePessoas.adicionarPessoa(new Cliente(nome, cpf, 0, cnh, categoriaCnh, cep, endereco, bairro, cidade, estado, telefone, email, whatsapp))
        repositorioDePessoas.adicionarPessoa(new Cliente("Celso Valente Anastacio", "44777726967", 448687823, "18960466861", "B", "88139-038", "Rua 1457", "Passagem de Maciambú (Ens Brito)", "Palhoça", "SC", "(47) 2344-7973", "celso.anastacio@geradornv.com.br", "(47) 97958-5521"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Otavio Bilé Pires", "33682388508", 364831364, "82576355780", "E", "49032-100", "Rua Manoel Vicente de Brito", "Farolândia", "Aracaju", "SE", "(79) 2018-2811", "otavio.pires@geradornv.com.br", "(79) 98426-1367"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Martin Coimbra da Cunha", "22411697309", 195496139, "65162622491", "E", "64607-705", "Travessa Cícero Duarte", "Junco", "Picos", "PI", "(86) 96911-8388", "martin.cunha@geradornv.com.br", "(86) 3118-7575"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Tiago Campelo Vogas", "86986758162", 111568894, "71628886900", "A", "77815-300", "Rua 13", "Loteamento Nova Araguaína", "Araguaína", "TO", "(63) 99913-1836", "tiago.vogas@geradornv.com.br", "(63) 3716-1393"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Dhiego Barbosa Vabo", "07270772606", 420786570, "79376418541", "A", "32681-666", "Beco Estreito", "Jardim Teresópolis", "Betim", "MG", "(35) 97663-5438", "dhiego.vabo@geradornv.com.br", "(32) 3748-4953"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Thamirys Cretella Garbelini", "13687741567", 137624475, "68439568105", "AB", "49020-490", "Rua Urquiza Leal", "Salgado Filho", "Aracaju", "SE", "(79) 98513-1457", "thamirys.garbelini@geradornv.com.br", "(79) 3223-5168"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Viviane Leal Castilho", "48078625960", 482221975, "58239142190", "B", "81870-015", "Rua João Antônio Culpi", "Pinheirinho", "Curitiba", "PR", "(42) 98265-8484", "viviane.castilho@geradornv.com.br", "(42) 3305-5634"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Joyce Claudino Soares", "62115525132", 246188467, "32286279286", "ACC", "72321-000", "Quadra QR 407", "Samambaia Norte (Samambaia)", "Brasília", "DF", "(61) 98741-0918", "joyce.soares@geradornv.com.br", "(61) 2971-4550"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Adriel Soares Garbelini", "92576474551", 117856381, "45684739432", "ACC", "49506-436", "Avenida Asa Branca", "Doutor José Milton Machado", "Itabaiana", "SE", "(79) 98046-4267", "adriel.garbelini@geradornv.com.br", "(79) 3100-4753"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Thalia Pinheiro Garcia", "73715154128", 398275579, "10378854685", "A", "77025-514", "Quadra ARSO 151 QI 5", "Plano Diretor Sul", "Palmas", "TO", "(63) 99128-2345", "thalia.garcia@geradornv.com.br", "(63) 2135-5215"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Breno Pena Rocha", "61120269377", 394635589, "97926767490", "E", "64065-030", "Rua João de Barro", "Pedra Mole", "Teresina", "PI", "(89) 99395-0372", "breno.rocha@geradornv.com.br", "(89) 2613-5301"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Carlos Auzier Velasco", "17151887566", 122396820, "26292145715", "B", "49511-500", "Rua José Vicente Monteiro", "Queimadas", "Itabaiana", "SE", "(79) 97636-2894", "carlos.velasco@geradornv.com.br", "(79) 2361-3217"));
/*        repositorioDePessoas.adicionarPessoa(new Cliente("", "", , "", "", "", "", "", "", "", "", "", ""));
        repositorioDePessoas.adicionarPessoa(new Cliente("", "", , "", "", "", "", "", "", "", "", "", ""));
        repositorioDePessoas.adicionarPessoa(new Cliente("", "", , "", "", "", "", "", "", "", "", "", ""));
        repositorioDePessoas.adicionarPessoa(new Cliente("", "", , "", "", "", "", "", "", "", "", "", ""));
        repositorioDePessoas.adicionarPessoa(new Cliente("", "", , "", "", "", "", "", "", "", "", "", ""));
        repositorioDePessoas.adicionarPessoa(new Cliente("", "", , "", "", "", "", "", "", "", "", "", ""));
        repositorioDePessoas.adicionarPessoa(new Cliente("", "", , "", "", "", "", "", "", "", "", "", ""));
        repositorioDePessoas.adicionarPessoa(new Cliente("", "", , "", "", "", "", "", "", "", "", "", ""));
        repositorioDePessoas.adicionarPessoa(new Cliente("", "", , "", "", "", "", "", "", "", "", "", ""));
        repositorioDePessoas.adicionarPessoa(new Cliente("", "", , "", "", "", "", "", "", "", "", "", ""));
        repositorioDePessoas.adicionarPessoa(new Cliente("", "", , "", "", "", "", "", "", "", "", "", ""));
        repositorioDePessoas.adicionarPessoa(new Cliente("", "", , "", "", "", "", "", "", "", "", "", ""));
        repositorioDePessoas.adicionarPessoa(new Cliente("", "", , "", "", "", "", "", "", "", "", "", ""));
        repositorioDePessoas.adicionarPessoa(new Cliente("", "", , "", "", "", "", "", "", "", "", "", ""));
        repositorioDePessoas.adicionarPessoa(new Cliente("", "", , "", "", "", "", "", "", "", "", "", ""));
        repositorioDePessoas.adicionarPessoa(new Cliente("", "", , "", "", "", "", "", "", "", "", "", ""));*/

    }

    public void criaVeiculos() {
        // Motos
        repositorioDeVeiculos.addVeiculo(new Moto("MUC7958", "Biz 80", new Marca("Fiat"), 2008, 25000, "Gasolina", 80));
        repositorioDeVeiculos.addVeiculo(new Moto("JJR4355", "Biz 100", new Marca("Fiat"), 2010, 80000, "Gasolina", 120));
        repositorioDeVeiculos.addVeiculo(new Moto("JEJ8798", "CG150", new Marca("Honda"), 2015, 12000, "Gasolina", 150));
        repositorioDeVeiculos.addVeiculo(new Moto("LQM0006", "CG200", new Marca("Honda"), 2018, 80000, "Gasolina", 200));
        repositorioDeVeiculos.addVeiculo(new Moto("KHY2839", "CG 160 Start", new Marca("Honda"), 2004, 15000, "Gasolina", 150));
        repositorioDeVeiculos.addVeiculo(new Moto("HNV2868", "CG 160 Titan", new Marca("Honda"), 2018, 85000, "Gasolina", 120));
        repositorioDeVeiculos.addVeiculo(new Moto("JVJ0137", "Forza 350", new Marca("Honda"), 2020, 70000, "Gasolina", 150));
        repositorioDeVeiculos.addVeiculo(new Moto("MXF7325", "Elite 125", new Marca("Honda"), 2022, 14000, "Gasolina", 180));
        repositorioDeVeiculos.addVeiculo(new Moto("MXF7325", "Biz 125", new Marca("Honda"), 2021, 12000, "Gasolina", 250));
        repositorioDeVeiculos.addVeiculo(new Moto("NDB5469", "Biz 110i", new Marca("Honda"), 2022, 11500, "Gasolina", 260));
        repositorioDeVeiculos.addVeiculo(new Moto("HNN8837", "CB 500F", new Marca("Honda"), 2020, 12480, "Gasolina", 170));
        repositorioDeVeiculos.addVeiculo(new Moto("IIL4469", "CB 250F Twister", new Marca("Honda"), 2019, 16790, "Gasolina", 180));
        repositorioDeVeiculos.addVeiculo(new Moto("MNY4694", "CB 1000R Black Edition", new Marca("Honda"), 2018, 18900, "Gasolina", 150));
        repositorioDeVeiculos.addVeiculo(new Moto("KCL4219", "CB 1000R", new Marca("Honda"), 2017, 19900, "Gasolina", 180));
        repositorioDeVeiculos.addVeiculo(new Moto("JFL6804", "CB 250F Twister", new Marca("Honda"), 2018, 20100, "Gasolina", 200));
        repositorioDeVeiculos.addVeiculo(new Moto("JTV0949", "Honda ADV", new Marca("Honda"), 2019, 13400, "Gasolina", 230));

        // Carros
        repositorioDeVeiculos.addVeiculo(new Carro("MKQ8507", "CL-244 2.8 132cv 4x4 TB Int.", new Marca("Cross Lander"), 2003, 25000, "Diesel", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("LWR9396", "9000 CD 2.3 Turbo", new Marca("Saab"), 2002, 80000, "Diesel", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("MJE6388", "TOPIC FURGAO L 2.2 8V/ 2.0 16V 4p", new Marca("JINBEI"), 1992, 120000, "Gasolina", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("MBR4428", "Hilux CD SR 4x4 3.0 8V 90cv Diesel", new Marca("Toyota"), 2002, 130000, "Flex", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("MGU3473", "Defender 90 TDI Hard Top Diesel", new Marca("Land Rover"), 1996, 115000, "Gasolina", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("MEZ1270", "HOVER CUV 2.4 16V 5p Mec.", new Marca("GREAT WALL"), 2008, 40000, "Alcool", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("LZH3275", "SL-63 AMG 5.5 Bi-Turbo V8 Aut.", new Marca("Mercedes-Benz"), 2013, 80000, "Gasolina", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("MLL1094", "Wraith 6.6 V12 Aut.", new Marca("Rolls-Royce"), 2014, 15000, "Gasolina", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("MHE0503", "156 SportWagon 2.5 V6 24V 190cv 4p Aut.", new Marca("Alfa Romeo"), 2003, 50000, "Alcool", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("MMD3744", "Pick-Up 4x2 Curto/Longo 2.5 TDI Diesel", new Marca("Matra"), 2002, 75600, "Gasolina", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("LZH7265", "Outback 3.0 H6 SW 245cv Aut.", new Marca("Subaru"), 2004, 78000, "Gasolina", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("LYN0101", "Grand Siena ATTRAC. 1.4 EVO F.Flex 8V", new Marca("Fiat"), 2002, 61300, "Flex", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("MJE5467", "F599 GTB Fiorano F1 6.0 V12 620cv", new Marca("Ferrari"), 2007, 400000, "Flex", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("MII7048", "PT Cruiser Limited 2.0 16V 4p", new Marca("Fiat"), 2001, 40560, "Alcool", 7));
        repositorioDeVeiculos.addVeiculo(new Carro("MCB0839", "155 Super", new Marca("Alfa Romeo"), 1995, 71050, "Flex", 7));
        repositorioDeVeiculos.addVeiculo(new Carro("MJF5888", "Carnival EX 3.8 V6 24V 242cv Aut.", new Marca("Kia Motors"), 2006, 68400, "Gasolina", 7));
        repositorioDeVeiculos.addVeiculo(new Carro("MJB2287", "Quattroporte Automatica 4.2 32V 400cv", new Marca("Maserati"), 2008, 17000, "Alcool", 7));
        repositorioDeVeiculos.addVeiculo(new Carro("MMM0009", "911 Carrera Coup", new Marca("Porsche"), 1992, 25600, "Flex", 7));
        repositorioDeVeiculos.addVeiculo(new Carro("MEU6423", "Gallardo Coupe LP560-4", new Marca("LAMBORGHINI"), 2010, 47000, "Gasolina", 7));
    }

    public void criaVendas() {
        repositorioDeVendas.adicionarVenda(
                new Venda(repositorioDeVeiculos.buscarVeiculo("MKQ8507"),
                        repositorioDePessoas.buscarPessoaPorCPF("28716399312"),
                        repositorioDePessoas.buscarPessoaPorCPF("72482237432")));
       repositorioDeVendas.adicionarVenda(
                new Venda(repositorioDeVeiculos.buscarVeiculo("MJE6388"),
                        repositorioDePessoas.buscarPessoaPorCPF("87357881270"),
                        repositorioDePessoas.buscarPessoaPorCPF("12876163993")));
       repositorioDeVendas.adicionarVenda(
                new Venda(repositorioDeVeiculos.buscarVeiculo("MEZ1270"),
                        repositorioDePessoas.buscarPessoaPorCPF("18746540915"),
                        repositorioDePessoas.buscarPessoaPorCPF("12876163993")));
    }

}
