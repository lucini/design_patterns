package chain;

import strategy.Orcamento;

import java.math.BigDecimal;

public interface Desconto {
    BigDecimal desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
