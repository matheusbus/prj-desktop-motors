package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.dao.VeiculoDAO;
import br.com.lojaveiculo.model.Carro;
import br.com.lojaveiculo.model.Marca;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;
import br.com.lojaveiculo.view.CadastroCarroView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    public void inicializarBotoes() {
        if (this.modeloCarro == null) {
            cadastroCarroView.adicionaAcaoAoBotaoCadastrar((ActionEvent e) -> {
                acaoCadastrar();
            });
        } else {
            cadastroCarroView.adicionaAcaoAoBotaoCadastrar((ActionEvent e) -> {
                acaoCancelar();
            });
        }

//        cadastroCarroView.adicionaAcaoAoBotaoCadastrar(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                acaoCancelar();
//            }
//        });
    }

    public void acaoCadastrar() {
        if (verificarPlaca(cadastroCarroView.getPlaca())) {
            if (verificaCamposNulos()) {
                String sPlaca = cadastroCarroView.getPlaca();
                String sModelo = cadastroCarroView.getModelo();
                Marca Marca = new Marca(cadastroCarroView.getMarca());
                String sChassi = cadastroCarroView.getChassi();
                String sCor = cadastroCarroView.getCor();
                String sTipoCarroceria = cadastroCarroView.getCbTipoCarroceria();
                String sTipoCombustivel = cadastroCarroView.getCbCombustivel();
                try {
                    int iAno = Integer.parseInt(cadastroCarroView.getCbTipoCarroceria());
                    double dPreco = Double.parseDouble(cadastroCarroView.getPreco());
                    int iPortas = Integer.parseInt(cadastroCarroView.getCbPorta());
                } catch (NumberFormatException ex) {
                    apresentarMensagem("Preecha os campos com valores válidos", "Erro");
                }
            }
        }
    }

    public void popularCamposCarroAlterar() {
        try {
            String sPlaca = cadastroCarroView.getPlaca();
        String sModelo = cadastroCarroView.getModelo();
        Marca Marca = new Marca(cadastroCarroView.getMarca());
        String sChassi = cadastroCarroView.getChassi();
        String sCor = cadastroCarroView.getCor();
        String sTipoCarroceria = cadastroCarroView.getCbTipoCarroceria();
        String sTipoCombustivel = cadastroCarroView.getCbCombustivel();
        int iAno = Integer.parseInt(cadastroCarroView.getCbTipoCarroceria());
            double dPreco = Double.parseDouble(cadastroCarroView.getPreco());
            int iPortas = Integer.parseInt(cadastroCarroView.getCbPorta());
        } catch (Exception e) {
        }
        
        try {
            
        } catch (Exception e) {
            apresentarMensagem(, sCor)
        }

        modeloCarro.setModelo(sModelo);
        modeloCarro.setMarca(Marca);
        modeloCarro.setChassi(sChassi);
        modeloCarro.setCor(sCor);
        modeloCarro.setTipoCarroceria(sTipoCarroceria);
        modeloCarro.setAno(iAno);
        modeloCarro.setPreco(dPreco);
        modeloCarro.setTipoCombustivel(sTipoCombustivel);

    }

    public void acaoCancelar() {
        fecharTela();
    }

    @Override
    public void exibirTela() {
        cadastroCarroView.exibirTela();
    }

    @Override
    public boolean verificaCamposNulos() {
        return cadastroCarroView.verificaCamposNulos();
    }

    @Override
    public void apresentarMensagem(String titulo, String mensagem) {
        cadastroCarroView.apresentaMensagem(mensagem, titulo);
    }

    public boolean verificarPlaca(String placa) {
        return cadastroCarroView.verificaLengthPlaca(placa);
    }

    @Override
    public void fecharTela() {
        cadastroCarroView.fecharTela();
    }
}
