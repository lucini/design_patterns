package strategy;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public void realizaCalculoICMS(Orcamento orcamento, Imposto imposto) {
        BigDecimal icms = imposto.calcula(orcamento);
        System.out.println(icms);
    }
}
