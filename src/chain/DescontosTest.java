package chain;

import strategy.Orcamento;

import java.math.BigDecimal;

public class DescontosTest {
    public static void main(String[] args) {
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(600));
        orcamento.addItem(new Item("VERGAMOTA", BigDecimal.valueOf(300)));
        orcamento.addItem(new Item("PINHÃO", BigDecimal.valueOf(450)));
        orcamento.addItem(new Item("POCÃ", BigDecimal.valueOf(450)));

        BigDecimal desconto = calculadoraDeDescontos.calcula(orcamento);
        System.out.println(desconto);
    }
}
