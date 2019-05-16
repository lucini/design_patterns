package strategy;

import java.math.BigDecimal;

public class ImpostosTest {

    public static void main(String[] args) {
        Imposto icms = new ICMS();
        Imposto iss = new ISS();

        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(500));

        CalculadoraDeImpostos calculadorDeImpostos = new CalculadoraDeImpostos();

        calculadorDeImpostos.realizaCalculoICMS(orcamento, icms);
        calculadorDeImpostos.realizaCalculoICMS(orcamento, iss);
    }
}