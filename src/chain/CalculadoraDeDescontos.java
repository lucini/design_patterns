package chain;

import strategy.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcula(Orcamento orcamento) {
        Desconto d1 = new DescontoPorQuantidadeItens();
        Desconto d2 = new DescontoPorValor();
        Desconto d3 = new SemDesconto();

        d1.setProximo(d2);
        d2.setProximo(d3);

        return d1.desconta(orcamento);
    }
}
