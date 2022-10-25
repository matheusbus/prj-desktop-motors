package br.com.lojaveiculo.comparator;

import br.com.lojaveiculo.model.*;
import java.util.Comparator;

/**
 *
 * @author Rafael
 */
public class ComparadorPreçoVenda implements Comparator<Venda> {

    @Override
    public int compare(Venda v1, Venda v2) {
        if (v1.getVeiculo().getPreco() > v2.getVeiculo().getPreco()) {
            return 1;
        } else {
            return -1;
        }
    }
}
