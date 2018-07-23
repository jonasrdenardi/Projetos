package model;

import java.util.Date;

public class Recebimento {
    
    private int id;
    private int num_parcela;
    private Date data_recebimento;
    private float valor_recebido;
    private String modo_pgto;
    private Usuario usuario;
    
    public Recebimento() {
    }

    public Recebimento(int id, int num_parcela, Date data_recebimento, float valor_recebido, String modo) {
        this.id = id;
        this.num_parcela = num_parcela;
        this.data_recebimento = data_recebimento;
        this.valor_recebido = valor_recebido;
        this.modo_pgto = modo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum_parcela() {
        return num_parcela;
    }

    public void setNum_parcela(int num_parcela) {
        this.num_parcela = num_parcela;
    }

    public Date getData_recebimento() {
        return data_recebimento;
    }

    public void setData_recebimento(Date data_recebimento) {
        this.data_recebimento = data_recebimento;
    }

    public float getValor_recebido() {
        return valor_recebido;
    }

    public void setValor_recebido(float valor_recebido) {
        this.valor_recebido = valor_recebido;
    }

    public String getModo_Pgto() {
        return modo_pgto;
    }

    public void setModo_Pgto(String modo_pgto) {
        this.modo_pgto = modo_pgto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
