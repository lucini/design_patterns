package strategy;

import chain.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private BigDecimal valor;
    private List<Item> itens;

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
        this.itens = new ArrayList<>();
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(this.itens);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void addItem(Item item) {
        this.itens.add(item);
    }
}
