package model;

public class Pedido {
    private int id;
    private Mesa mesa;
    private String data;
    private float valor;
    private Item item[];
    private ItemPedido qtdItem[];
    private Usuario usuario;
    private float garcom10;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public float getGarcom10() {
        return garcom10;
    }

    public void setGarcom10(float garcom10) {
        this.garcom10 = garcom10;
    }
    

    public  Item[] getItem() {
        return item;
    }
    
    public Item getItem(int aux) {
        return item[aux];
    }

    public void setItem(Item[] item) {
        this.item = item;
    }

    public ItemPedido[] getQtdItem() {
        return qtdItem;
    }
    
    public ItemPedido getQtdItem(int aux) {
        return qtdItem[aux];
    }

    public void setQtdItem(ItemPedido[] qtdItem) {
        this.qtdItem = qtdItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
}
