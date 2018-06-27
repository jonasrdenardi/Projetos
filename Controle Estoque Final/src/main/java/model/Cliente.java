package model;

public class Cliente {
    private int id;
    private String nome;
    private String telefone;
    private String cpf;
    private boolean fg_ativo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean getFg_ativo() {
        return fg_ativo;
    }

    public void setFg_ativo(boolean fg_ativo) {
        this.fg_ativo = fg_ativo;
    }
    
    
}
