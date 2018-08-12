package model;

import java.util.ArrayList;
import java.util.List;

public class ProdutoVenda {
    private int idVenda;
    private int idProduto;
    private float QtdProduto;
    private float precoProduto;

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public float getQtdProduto() {
        return QtdProduto;
    }

    public void setQtdProduto(float QtdProduto) {
        this.QtdProduto = QtdProduto;
    }

    public float getValorProduto() {
        return precoProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.precoProduto = valorProduto;
    }
    
}
