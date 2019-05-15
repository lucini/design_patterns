package strategy;

import java.math.BigDecimal;

public class Orcamento {

    public BigDecimal getValor() {
        return valor;
    }

    private BigDecimal valor;

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }
}
