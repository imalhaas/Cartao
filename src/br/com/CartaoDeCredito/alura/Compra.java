package br.com.CartaoDeCredito.alura;

public class Compra {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compras: descricao" + descricao + " valor: " + valor;
    }
}
