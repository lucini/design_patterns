package chain;

import strategy.Orcamento;

import java.math.BigDecimal;

public class DescontoPorQuantidadeItens implements Desconto {
    private Desconto proximo;

    /**
     * Desconta 7% se tiver mais de 2 itens.
     *
     * @param orcamento
     * @return
     */
    public BigDecimal desconta(Orcamento orcamento) {
        if (orcamento.getItens().size() > 2) {
            return orcamento.getValor().multiply(BigDecimal.valueOf(0.07));
        } else {
            return proximo.desconta(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
