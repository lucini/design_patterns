package chain;

import strategy.Orcamento;

import java.math.BigDecimal;

public class DescontoPorValor implements Desconto {
    Desconto proximo;

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

    /**
     * Desconta 10% se o valor foir maior que 500
     *
     * @param orcamento
     * @return
     */
    public BigDecimal desconta(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(BigDecimal.valueOf(500)) > 0) {
            return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
        } else {
            return this.proximo.desconta(orcamento);
        }
    }
}
