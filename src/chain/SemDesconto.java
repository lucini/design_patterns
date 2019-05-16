package chain;

import strategy.Orcamento;

import java.math.BigDecimal;

public class SemDesconto implements Desconto {

    @Override
    public BigDecimal desconta(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public void setProximo(Desconto proximo) {
        // não tem desconto
    }
}
