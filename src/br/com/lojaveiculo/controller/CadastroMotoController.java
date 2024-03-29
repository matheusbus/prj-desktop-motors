package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.dao.VeiculoDAO;
import br.com.lojaveiculo.model.Marca;
import br.com.lojaveiculo.model.Moto;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;
import br.com.lojaveiculo.view.CadastroMotoView;
import java.awt.event.ActionEvent;

public class CadastroMotoController extends BaseCadastroController {

    private CadastroMotoView cadastroMotoView;
    private Moto modeloMoto;
    private VeiculoRepositorio veiculoRepositorio;
    private ConsultaMotoController consultaMotoController;

    public CadastroMotoController() {
        this.cadastroMotoView = new CadastroMotoView();
        this.modeloMoto = null;
        this.veiculoRepositorio = new VeiculoDAO();
        inicializarBotoes();
        inicializaCadastro();
    }

    public CadastroMotoController(CadastroMotoView cadastroMotoView, Moto modeloMoto, ConsultaMotoController consultaMotoController) {
        this.cadastroMotoView = cadastroMotoView;
        this.modeloMoto = modeloMoto;
        this.veiculoRepositorio = veiculoRepositorio;
        this.consultaMotoController = consultaMotoController;
        inicializarBotoes();
        inicializaAlteracao();
        popularCamposMotoAlterar();
    }

    @Override
    public void inicializarBotoes() {
        cadastroMotoView.adicionaAcaoBtnCadastrar((ActionEvent e) -> {
            acaoCadastrar();
        });

        cadastroMotoView.adicionaAcaoBtnAlterar((ActionEvent e) -> {
            acaoAlterar();
        });

        cadastroMotoView.adicionaAcaoBtnCancelar((ActionEvent e) -> {
            acaoCancelar();
        });
    }

    @Override
    public void exibirTela() {
        cadastroMotoView.exibirTela();
    }

    @Override
    public void apresentarMensagem(String mensagem, String titulo) {
        cadastroMotoView.apresentaMensagem(mensagem, titulo);
    }

    @Override
    public void fecharTela() {
        cadastroMotoView.fecharTela();
    }

    public boolean verificaPlaca(String placa) {
        return cadastroMotoView.verificaLengthPlaca(placa);
    }

    @Override
    public boolean verificaCamposNulos() {
        return cadastroMotoView.verificaCamposNulos();
    }

    public void inicializaCadastro() {
        cadastroMotoView.inicializaCadastro();
    }

    public void inicializaAlteracao() {
        cadastroMotoView.inicializaAlteracao();
    }

    public void popularCamposMotoAlterar() {
        try {
            cadastroMotoView.setAno(String.valueOf(modeloMoto.getAno()));
            cadastroMotoView.setCarroceria(modeloMoto.getTipoCarroceria());
            cadastroMotoView.setChassi(modeloMoto.getChassi());
            cadastroMotoView.setCilindradas(String.valueOf(modeloMoto.getCilindrada()));
            cadastroMotoView.setCombustivel(modeloMoto.getTipoCombustivel());
            cadastroMotoView.setCor(modeloMoto.getCor());
            cadastroMotoView.setPlaca(modeloMoto.getPlaca());
            cadastroMotoView.setPreco(String.valueOf(modeloMoto.getPreco()));
            cadastroMotoView.setMarca(modeloMoto.getMarca().toString());
            cadastroMotoView.setModelo(modeloMoto.getModelo());
        } catch (NumberFormatException ex) {
            apresentarMensagem("Prencha os campos com valores válidos", "Erro");
        }
    }

    public void acaoCadastrar() {

        if (verificaPlaca(cadastroMotoView.getPlaca())) {
            if (verificaCamposNulos()) {
                try {
                    String sPlaca = cadastroMotoView.getPlaca().toUpperCase();
                    String sModelo = cadastroMotoView.getModelo();
                    Marca Marca = new Marca(cadastroMotoView.getMarca());
                    String sChassi = cadastroMotoView.getChassi();
                    String sCor = cadastroMotoView.getCor();
                    String sTipoCarroceira = cadastroMotoView.getCarroceria();
                    int iAno = Integer.parseInt(cadastroMotoView.getAno());
                    Double dPreco = Double.valueOf(cadastroMotoView.getPreco());
                    String sTipoCombustivel = cadastroMotoView.getCombustivel();
                    int iCilindradas = Integer.parseInt(cadastroMotoView.getCilindradas());

                    Moto novaMoto = new Moto(sPlaca, sModelo, Marca, sChassi, sCor, sTipoCarroceira, iAno, dPreco, sTipoCombustivel, iCilindradas);
                    veiculoRepositorio.addVeiculo(novaMoto);

                    apresentarMensagem("Veículo cadastrado com sucesso!", "Cadastro realizado");
                    fecharTela();
                } catch (NumberFormatException ex) {
                    apresentarMensagem("Preencha os campos com valores válidos!", "Erro");
                }
            } else {
                apresentarMensagem("Preencha todos os campos!", "Erro no cadastro");
            }
        } else {
            apresentarMensagem("A placa digitada é inválida!", "Erro no cadastro");
        }
    }

    public void acaoAlterar() {

        if (verificaPlaca(cadastroMotoView.getPlaca())) {
            if (verificaCamposNulos()) {
                try {
                    String sPlaca = cadastroMotoView.getPlaca().toUpperCase();
                    String sModelo = cadastroMotoView.getModelo();
                    Marca Marca = new Marca(cadastroMotoView.getMarca());
                    String sChassi = cadastroMotoView.getChassi();
                    String sCor = cadastroMotoView.getCor();
                    String sTipoCarroceira = cadastroMotoView.getCarroceria();
                    int iAno = Integer.parseInt(cadastroMotoView.getAno());
                    Double dPreco = Double.valueOf(cadastroMotoView.getPreco());
                    String sTipoCombustivel = cadastroMotoView.getCombustivel();
                    int iCilindradas = Integer.parseInt(cadastroMotoView.getCilindradas());

                    modeloMoto.setModelo(sModelo);
                    modeloMoto.setChassi(sChassi);
                    modeloMoto.setCor(sCor);
                    modeloMoto.setTipoCarroceria(sTipoCarroceira);
                    modeloMoto.setAno(iAno);
                    modeloMoto.setPreco(dPreco);
                    modeloMoto.setTipoCombustivel(sTipoCombustivel);
                    modeloMoto.setCilindrada(iCilindradas);

                    apresentarMensagem("Veículo alterado com sucesso!", "Alteração realizada");
                    consultaMotoController.popularTabela();
                    fecharTela();
                } catch (NumberFormatException ex) {
                    apresentarMensagem("Preencha os campos com valores válidos!", "Erro");
                }
            } else {
                apresentarMensagem("Preencha todos os campos!", "Erro no cadastro");
            }
        } else {
            apresentarMensagem("A placa digitada é invalida!", "Erro no cadastro");
        }
    }

    public void acaoCancelar() {
        fecharTela();
    }
}
