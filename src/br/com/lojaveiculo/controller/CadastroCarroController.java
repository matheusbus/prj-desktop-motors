package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.dao.VeiculoDAO;
import br.com.lojaveiculo.model.Carro;
import br.com.lojaveiculo.model.Marca;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;
import br.com.lojaveiculo.view.CadastroCarroView;
import java.awt.event.ActionEvent;

public class CadastroCarroController extends BaseCadastroController {

    private CadastroCarroView cadastroCarroView;
    private Carro modeloCarro;
    private VeiculoRepositorio veiculoRepositorio;

    public CadastroCarroController() {
        this.cadastroCarroView = new CadastroCarroView();
        this.modeloCarro = null;
        this.veiculoRepositorio = new VeiculoDAO();
        inicializarBotoes();
    }

    public CadastroCarroController(CadastroCarroView cadastroCarroView, Carro modeloCarro) {
        this.cadastroCarroView = cadastroCarroView;
        this.modeloCarro = modeloCarro;
        this.veiculoRepositorio = veiculoRepositorio;
        inicializarBotoes();
    }

    @Override
    public boolean verificaCamposNulos() {
        return cadastroCarroView.verificaCamposNulos();
    }

    @Override
    public void inicializarBotoes() {
        if (this.modeloCarro == null) {
            cadastroCarroView.adicionaAcaoBtnCadastrar((ActionEvent e) -> {
                acaoCadastrar();
            });
        }
        cadastroCarroView.adicionaAcaoBtnCancelar((ActionEvent e) -> {
            acaoCancelar();

        });
    }

    @Override
    public void exibirTela() {
        cadastroCarroView.exibirTela();
    }

    @Override
    public void apresentarMensagem(String titulo, String mensagem) {
        cadastroCarroView.apresentaMensagem(mensagem, titulo);
    }

    @Override
    public void fecharTela() {
        cadastroCarroView.fecharTela();
    }

    public boolean verificarPlaca(String placa) {
        return cadastroCarroView.verificaLengthPlaca(placa);
    }

    public void acaoCadastrar() {
        if (verificarPlaca(cadastroCarroView.getPlaca())) {
            if (verificaCamposNulos()) {
                try {
                    String sPlaca = cadastroCarroView.getPlaca();
                    String sModelo = cadastroCarroView.getModelo();
                    Marca Marca = new Marca(cadastroCarroView.getMarca());
                    String sChassi = cadastroCarroView.getChassi();
                    String sCor = cadastroCarroView.getCor();
                    String sTipoCarroceria = cadastroCarroView.getTipoCarroceria();
                    String sTipoCombustivel = cadastroCarroView.getCombustivel();
                    int iAno = Integer.parseInt(cadastroCarroView.getAno());
                    double dPreco = Double.parseDouble(cadastroCarroView.getPreco());
                    int iPortas = Integer.parseInt(cadastroCarroView.getPorta());

                    veiculoRepositorio.addVeiculo(modeloCarro);
                    apresentarMensagem("Veículo Cadastrado com Sucesso", "Cadastro Realizado");
                    fecharTela();
                } catch (NumberFormatException ex) {
                    apresentarMensagem("Preecha os campos com valores válidos", "Erro");
                }
            } else {
                apresentarMensagem("Preencha todos os campos!", "Erro no cadastro");
            }
        } else {
            apresentarMensagem("A placa digitada é invalida!", "Erro no cadastro");
        }

    }

    private void acaoAlterar() {
        if (verificarPlaca(cadastroCarroView.getPlaca())) {
            if (verificaCamposNulos()) {
                try {
                    String sPlaca = cadastroCarroView.getPlaca();
                    String sModelo = cadastroCarroView.getModelo();
                    Marca Marca = new Marca(cadastroCarroView.getMarca());
                    String sChassi = cadastroCarroView.getChassi();
                    String sCor = cadastroCarroView.getCor();
                    String sTipoCarroceria = cadastroCarroView.getTipoCarroceria();
                    String sTipoCombustivel = cadastroCarroView.getCombustivel();
                    int iAno = Integer.parseInt(cadastroCarroView.getAno());
                    double dPreco = Double.parseDouble(cadastroCarroView.getPreco());
                    int iPortas = Integer.parseInt(cadastroCarroView.getPorta());

                    modeloCarro.setModelo(sModelo);
                    // modeloCarro.setMarca(marca);
                    modeloCarro.setChassi(sChassi);
                    modeloCarro.setCor(sCor);
                    modeloCarro.setTipoCarroceria(sTipoCarroceria);
                    modeloCarro.setTipoCombustivel(sTipoCombustivel);
                    modeloCarro.setAno(iAno);
                    modeloCarro.setPreco(dPreco);
                    modeloCarro.setPortas(iPortas);

                    apresentarMensagem("Veículo alterado com sucesso", "Alteração Realizada");
                    fecharTela();
                } catch (NumberFormatException ex) {
                    apresentarMensagem("Preencha todos os campos com valores válidos", "Erro");
                }
            } else {
                apresentarMensagem("Preencha todos os campos", "Erro no cadastro");
            }
        } else {
            apresentarMensagem("A placa digitada é inválida!", "Erro no cadastro");
        }

    }

    public void popularCamposCarroAlterar() {
        try{
        cadastroCarroView.setModelo(modeloCarro.getModelo());
        //cadastroCarroView.setMarca(modeloCarro.getMarca().toString());
        cadastroCarroView.setChassi(modeloCarro.getChassi());
        cadastroCarroView.setCor(modeloCarro.getCor());
        cadastroCarroView.setTipoCarroceria(modeloCarro.getTipoCarroceria());
        cadastroCarroView.setCombustivel(modeloCarro.getTipoCombustivel());
        
        cadastroCarroView.setPorta(String.valueOf(modeloCarro.getPorta()));
        cadastroCarroView.setPreco(String.valueOf(modeloCarro.getPreco()));
        cadastroCarroView.setAno(String.valueOf(modeloCarro.getAno()));
        }catch(NumberFormatException ex){
            apresentarMensagem("Preencha todos os campos com valores válidos", "Erro");
        }
    }

    public void acaoCancelar() {
        fecharTela();
    }

}
