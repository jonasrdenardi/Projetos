package model;

import java.io.Serializable;
import java.util.Date;

public class Produto implements Serializable{

    private int id;
    private String descricao;
    private float qtd;
    private float preco;
    private float precoCompra; 
    private Usuario usuario;
    private Date data;
    private boolean fg_ativo;

    public Produto() {
    }

    public Produto(int id, String descricao, float qtd, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtd = qtd;
        this.preco = preco;
    }

    public boolean getFg_ativo() {
        return fg_ativo;
    }

    public void setFg_ativo(boolean fg_ativo) {
        this.fg_ativo = fg_ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descrição) {
        this.descricao = descrição;
    }

    public float getQtd() {
        return qtd;
    }

    public void setQtd(float qtd) {
        this.qtd = qtd;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }
    
}
