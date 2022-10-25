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

    // Teste
    public void criaUsuarios() {
        repositorioDeUsuarios = new UsuarioDAO();
        repositorioDeUsuarios.adicionarUsuario(new Usuario("Rafael", "rafa123"));
        repositorioDeUsuarios.adicionarUsuario(new Usuario("Eduardo", "edu123"));
        repositorioDeUsuarios.adicionarUsuario(new Usuario("Matheus", "math123"));
        repositorioDeUsuarios.adicionarUsuario(new Usuario("admin", "admin"));
    }

    //Teste
    public void criaFuncionarios() {
        repositorioDePessoas.adicionarPessoa(new Vendedor("Rafael", "12876163993", 1212121, "89163232", "Rua Valmor Pasqualine", "Canta Galo", "Rio do Sul", "SC", "(98) 3357-4626", "rdalmarco@yahoo.com.br", 10.0, "", "Santander", 0, 0, 0.0));
        repositorioDePessoas.adicionarPessoa(new Vendedor("Matheus", "18376412983", 1313131, "89161424", "Rua dos vereadores", "Centro", "Ibirama", "SC", "(79) 3256-9225", "buschermoehle@gmail.com", 8.0, "", "Itaú", 0, 0, 0.0));
        repositorioDePessoas.adicionarPessoa(new Vendedor("Eduardo", "11077688804", 1414141, "89161464", "Rua José Pinheiro", "Bela Aliança", "Rio do Sul", "SC", "(47) 9999-0000", "sangaletti@gmail.com", 6.0, "", "Nubank", 0, 0, 0.0));
        repositorioDePessoas.adicionarPessoa(new Gerente("Admin", "44444444444", 2424242, "89160444", "Rua Jardim primavera", "Centro", "Rodeio", "SC", "(47) 4949-2424", "paolao@gmail.com", 10000.0, "99999", "Banco Pan", 234, 123456));
        //repositorioDePessoas.adicionarPessoa(new Vendedor(13.5, 6000, "Nicollas Nepomuceno Pinto Alentejo", "25516297648", "(63) 3233-4798"));
        //repositorioDePessoas.adicionarPessoa(new Gerente(7000.00, "Yago Garbelini Teixeira Vaz", "14332847156", "(95) 2936-7851", "Administrativo"));
        //repositorioDePessoas.adicionarPessoa(new Vendedor(15.0, 1600, "Lucas Felipe Figueiras Alfradique Carino", "69148632880", "(67) 3326-0230"));
        //repositorioDePessoas.adicionarPessoa(new Vendedor(17.5, 2200, "Jhonas Carneiro Gualberto Conceição", "12445499593", "(87) 3323-5724"));
        //repositorioDePessoas.adicionarPessoa(new Vendedor(22.0, 2500, "Rone Cretella Monnerat Belmiro", "67505462342", "(54) 2567-8074"));
        //repositorioDePessoas.adicionarPessoa(new Vendedor(10.0, 2900, "Augusto Gouveia Mourão Corrêa", "04786841340", "(35) 2471-5577"));
        //repositorioDePessoas.adicionarPessoa(new Vendedor(5.5, 2600, "Sandra Braz Mateus Barcelos", "62912457106", "(84) 3242-5950"));
        //repositorioDePessoas.adicionarPessoa(new Gerente(15500, "Elenice Nespoli Latin Celestino", "19883542186", "(92) 2045-2818", "Recursos Humanos"));
        //repositorioDePessoas.adicionarPessoa(new Vendedor(6.0, 4030, "Roseli Carvel Espindola Viana", "35941780133", "(61) 2417-7629"));
        //repositorioDePessoas.adicionarPessoa(new Vendedor(7.5, 1800, "Silvio Prata de Lima Neto", "61325635804", "(65) 2951-9753"));
        //repositorioDePessoas.adicionarPessoa(new Vendedor(8.0, 2300, "Ivone Pena dos Santos Chaves", "72482237432", "(44) 2759-6625"));
    }

    //Teste
    public void criaClientes() {
        repositorioDePessoas.adicionarPessoa(new Cliente("Celso Valente Anastacio", "44777726967", 448687823, "18960466861", "B", "88139-038", "Rua 1457", "Passagem", "Palhoça", "SC", "(47) 2344-7973", "celso.anastacio@gmail.com.br", "(47) 97958-5521"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Otavio Bilé Pires", "33682388508", 364831364, "82576355780", "E", "49032-100", "Rua Manoel Vicente de Brito", "Farolândia", "Aracaju", "SE", "(79) 2018-2811", "otavio.pires@gmail.com.br", "(79) 98426-1367"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Martin Coimbra da Cunha", "22411697309", 195496139, "65162622491", "E", "64607-705", "Travessa Cícero Duarte", "Junco", "Picos", "PI", "(86) 96911-8388", "martin.cunha@gmail.com.br", "(86) 3118-7575"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Tiago Campelo Vogas", "86986758162", 111568894, "71628886900", "A", "77815-300", "Rua 13", "Nova Araguaína", "Araguaína", "TO", "(63) 99913-1836", "tiago.vogas@gmail.com.br", "(63) 3716-1393"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Dhiego Barbosa Vabo", "07270772606", 420786570, "79376418541", "A", "32681-666", "Beco Estreito", "Jardim Teresópolis", "Betim", "MG", "(35) 97663-5438", "dhiego.vabo@gmail.com.br", "(32) 3748-4953"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Thamirys Cretella Garbelini", "13687741567", 137624475, "68439568105", "AB", "49020-490", "Rua Urquiza Leal", "Salgado Filho", "Aracaju", "SE", "(79) 98513-1457", "thamirys.garbelini@gmail.com.br", "(79) 3223-5168"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Viviane Leal Castilho", "48078625960", 482221975, "58239142190", "B", "81870-015", "Rua João Antônio Culpi", "Pinheirinho", "Curitiba", "PR", "(42) 98265-8484", "viviane.castilho@gmail.com.br", "(42) 3305-5634"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Joyce Claudino Soares", "62115525132", 246188467, "32286279286", "ACC", "72321-000", "Quadra QR 407", "Samambaia", "Brasília", "DF", "(61) 98741-0918", "joyce.soares@gmail.com.br", "(61) 2971-4550"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Adriel Soares Garbelini", "92576474551", 117856381, "45684739432", "ACC", "49506-436", "Avenida Asa Branca", "Doutor José Milton Machado", "Itabaiana", "SE", "(79) 98046-4267", "adriel.garbelini@gmail.com.br", "(79) 3100-4753"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Thalia Pinheiro Garcia", "73715154128", 398275579, "10378854685", "A", "77025-514", "Quadra ARSO 151 QI 5", "Plano Diretor Sul", "Palmas", "TO", "(63) 99128-2345", "thalia.garcia@gmail.com.br", "(63) 2135-5215"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Breno Pena Rocha", "61120269377", 394635589, "97926767490", "E", "64065-030", "Rua João de Barro", "Pedra Mole", "Teresina", "PI", "(89) 99395-0372", "breno.rocha@gmail.com.br", "(89) 2613-5301"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Carlos Auzier Velasco", "17151887566", 122396820, "26292145715", "B", "49511-500", "Rua José Vicente Monteiro", "Queimadas", "Itabaiana", "SE", "(79) 97636-2894", "carlos.velasco@gmail.com.br", "(79) 2361-3217"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Anthony Nespoli Vilela", "35634362237", 245549649, "64616494618", "D", "69921-872", "Rua Fluminense", "Defesa Civil", "Rio Branco", "AC", "(68) 97519-7135", "anthony.vilela@gmail.com.br", "(68) 2979-8950"));
        repositorioDePessoas.adicionarPessoa(new Cliente("Maiara Cavalcante Quindeler", "88408268236", 310347543, "62099023823", "ACC", "68907-303", "Avenida Antônio Carlos Farias de Souza", "Pantanal", "Macapá", "AP", "(96) 99923-7567", "maiara.quindeler@gmail.com.br", "(96) 3534-4724"));
    }

    public void criaVeiculos() {
        // Motos
        repositorioDeVeiculos.addVeiculo(new Moto("MUC7958", "Biz 80", new Marca("Fiat"), "31F AaadDL lR EL9194", "Azul", "Big Trail", 2008, 25000, "Gasolina", 80));
        repositorioDeVeiculos.addVeiculo(new Moto("JJR4355", "Biz 100", new Marca("Fiat"), "5SC EAJ7AS Sx uV4752", "Prata", "Motoneta", 2010, 80000, "Gasolina", 120));
        repositorioDeVeiculos.addVeiculo(new Moto("JEJ8798", "CG150", new Marca("Honda"), "86H XgGsZ4 j2 Ed9892", "Vermelho", "Street", 2015, 12000, "Gasolina", 150));
        repositorioDeVeiculos.addVeiculo(new Moto("LQM0006", "CG200", new Marca("Honda"), "6k9 9AS3H8 2X gK4032", "Prata", "Street", 2018, 80000, "Gasolina", 200));
        repositorioDeVeiculos.addVeiculo(new Moto("KHY2839", "CG 160 Start", new Marca("Honda"), "30M MtDas1 5r Preto", "Branco", "Naked", 2004, 15000, "Gasolina", 150));
        repositorioDeVeiculos.addVeiculo(new Moto("HNV2868", "CG 160 Titan", new Marca("Honda"), "1Z5 AcFWyN U3 1g3691", "Branco", "Street", 2018, 85000, "Gasolina", 120));
        repositorioDeVeiculos.addVeiculo(new Moto("JVJ0137", "Forza 350", new Marca("Honda"), "5EL W9Srn3 NF ul8043", "Prata", "Street", 2020, 70000, "Gasolina", 150));
        repositorioDeVeiculos.addVeiculo(new Moto("MXF7325", "Elite 125", new Marca("Honda"), "8MR M0ZZYN vs mB1068", "Verde", "Street", 2022, 14000, "Gasolina", 180));
        repositorioDeVeiculos.addVeiculo(new Moto("MXF7325", "Biz 125", new Marca("Honda"), "3jA 1WkRRu rj zG8252", "Marrom", "Motoneta", 2021, 12000, "Gasolina", 250));
        repositorioDeVeiculos.addVeiculo(new Moto("NDB5469", "Biz 110i", new Marca("Honda"), "2s2 v3T2A3 fd e13693", "Branco", "Motoneta", 2022, 11500, "Gasolina", 260));
        repositorioDeVeiculos.addVeiculo(new Moto("HNN8837", "CB 500F", new Marca("Honda"), "52x 7AlAlk R9 3A6378", "Preto", "Street", 2020, 12480, "Gasolina", 170));
        repositorioDeVeiculos.addVeiculo(new Moto("IIL4469", "CB 250F Twister", new Marca("Honda"), "1hK 3eAxCA ck 6X9940", "Preto", "Street", 2019, 16790, "Gasolina", 180));
        repositorioDeVeiculos.addVeiculo(new Moto("MNY4694", "CB 1000R Black Edition", new Marca("Honda"), "66f mSPuE0 ph 085755", "Branco", "Street", 2018, 18900, "Gasolina", 150));
        repositorioDeVeiculos.addVeiculo(new Moto("KCL4219", "CB 1000R", new Marca("Honda"), "8f7 UF2d8A UA uA5652", "Prata", "Naked", 2017, 19900, "Gasolina", 180));
        repositorioDeVeiculos.addVeiculo(new Moto("JFL6804", "CB 250F Twister", new Marca("Honda"), "1f9 UsjA23 Uj 496421", "Azul", "Triciclo", 2018, 20100, "Gasolina", 200));
        repositorioDeVeiculos.addVeiculo(new Moto("JTV0949", "Honda ADV", new Marca("Honda"), "2s1 C1mALM kA NA4566", "Amarelo", "Esportiva", 2019, 13400, "Gasolina", 230));

        // Carros
        repositorioDeVeiculos.addVeiculo(new Carro("MKQ8507", "CL-244 2.8 132cv 4x4 TB Int.", new Marca("Cross Lander"), "231 j8rVAA 13 k34845", "Prata", "Caminhoneta", 2003, 25000, "Diesel", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("LWR9396", "9000 CD 2.3 Turbo", new Marca("Saab"), "682 CsJk3U m8 DR0975", "Chumbo", "Sedan", 2002, 80000, "Diesel", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("AJE6388", "TOPIC FURGAO L 2.2 8V/ 2.0 16V 4p", new Marca("JINBEI"), "7Wk ketC5v yg GU6616", "Cinza", "Sedan", 1992, 120000, "Gasolina", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("MBR4428", "Hilux CD SR 4x4 3.0 8V 90cv Diesel", new Marca("Toyota"), "6t3 UAeD7y zu VT2245", "Preto", "Hatch", 2002, 130000, "Flex", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("MGU3473", "Defender 90 TDI Hard Top Diesel", new Marca("Land Rover"), "5My P60kM9 GK 1C2457", "Prata", "Hatch", 1996, 115000, "Gasolina", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("ZEZ1270", "HOVER CUV 2.4 16V 5p Mec.", new Marca("GREAT WALL"), "6hU u8E4Ce vm z01635", "Amarelo", "Sedan", 2008, 40000, "Alcool", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("LZH3275", "SL-63 AMG 5.5 Bi-Turbo V8 Aut.", new Marca("Mercedes-Benz"), "53x AZGA60 7T Z70286", "Vermelho", "SUV", 2013, 80000, "Gasolina", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("MLL1094", "Wraith 6.6 V12 Aut.", new Marca("Rolls-Royce"), "30A 2NVAXN h6 Aj3203", "AZUL", "Vermelho", 2014, 15000, "Gasolina", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("MHE0503", "156 SportWagon 2.5 V6 24V 190cv 4p Aut.", new Marca("Alfa Romeo"), "7AG a5wjBp CH lM5868", "Prata", "Sedan", 2003, 50000, "Alcool", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("MMD3744", "Pick-Up 4x2 Curto/Longo 2.5 TDI Diesel", new Marca("Matra"), "7w2 kPjAH2 dc h29305", "Prata", "Hatch", 2002, 75600, "Gasolina", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("LZH7265", "Outback 3.0 H6 SW 245cv Aut.", new Marca("Subaru"), "6ZF MYAJpT z2 JH2876", "Preto", "SUV", 2004, 78000, "Gasolina", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("LYN0101", "Grand Siena ATTRAC. 1.4 EVO F.Flex 8V", new Marca("Fiat"), "48a yv3Pb3 c4 Sa9206", "Vermelho", "Sedan", 2002, 61300, "Flex", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("MJE5467", "F599 GTB Fiorano F1 6.0 V12 620cv", new Marca("Ferrari"), "3Kk GAKA5A Jn As6993", "Azul", "Esportivo", 2007, 400000, "Flex", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("MII7048", "PT Cruiser Limited 2.0 16V 4p", new Marca("Fiat"), "5bA sJe15x 4h Bv6251", "Azul", "Hatch", 2001, 40560, "Alcool", 7));
        repositorioDeVeiculos.addVeiculo(new Carro("MCB0839", "155 Super", new Marca("Alfa Romeo"), "32L 0mReZA 2F e73667", "Preto", "SUV", 1995, 71050, "Flex", 7));
        repositorioDeVeiculos.addVeiculo(new Carro("MJF5888", "Carnival EX 3.8 V6 24V 242cv Aut.", new Marca("Kia Motors"), "3CB 5MwlnF tV 6z5784", "Prata", "Sedan", 2006, 68400, "Gasolina", 7));
        repositorioDeVeiculos.addVeiculo(new Carro("MJB2287", "Quattroporte Automatica 4.2 32V 400cv", new Marca("Maserati"), "7H1 UAlw4K v1 1A8385", "Branco", "SUV", 2008, 17000, "Alcool", 7));
        repositorioDeVeiculos.addVeiculo(new Carro("MMM0009", "911 Carrera Coup", new Marca("Porsche"), "1xp h17VcH 7J 4P2337", "Branco", "Hatch", 1992, 25600, "Flex", 7));
        repositorioDeVeiculos.addVeiculo(new Carro("MEU6423", "Gallardo Coupe LP560-4", new Marca("LAMBORGHINI"), "1kC 705AzL YT u91639", "Branco", "Sedan", 2010, 47000, "Gasolina", 7));
    }

    public void criaVendas() {
        repositorioDeVendas.adicionarVenda(
                new Venda(repositorioDeVeiculos.buscarVeiculo("MKQ8507"),
                        repositorioDePessoas.buscarPessoaPorCPF("48078625960"),
                        repositorioDePessoas.buscarPessoaPorCPF("12876163993")));
        repositorioDeVendas.adicionarVenda(
                new Venda(repositorioDeVeiculos.buscarVeiculo("AJE6388"),
                        repositorioDePessoas.buscarPessoaPorCPF("22411697309"),
                        repositorioDePessoas.buscarPessoaPorCPF("12876163993")));
        repositorioDeVendas.adicionarVenda(
                new Venda(repositorioDeVeiculos.buscarVeiculo("ZEZ1270"),
                        repositorioDePessoas.buscarPessoaPorCPF("61120269377"),
                        repositorioDePessoas.buscarPessoaPorCPF("12876163993")));
        repositorioDeVendas.adicionarVenda(
                new Venda(repositorioDeVeiculos.buscarVeiculo("MJE5467"),
                        repositorioDePessoas.buscarPessoaPorCPF("62115525132"),
                        repositorioDePessoas.buscarPessoaPorCPF("11077688804")));
        repositorioDeVendas.adicionarVenda(
                new Venda(repositorioDeVeiculos.buscarVeiculo("LZH3275"),
                        repositorioDePessoas.buscarPessoaPorCPF("62115525132"),
                        repositorioDePessoas.buscarPessoaPorCPF("18376412983")));
    }
}
