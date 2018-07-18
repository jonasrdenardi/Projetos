package model;

public class Usuario {
    private String nome;
    private String senha;
    private int limiteCon;

    public int getLimiteCon() {
        return limiteCon;
    }

    public void setLimiteCon(int limiteCon) {
        this.limiteCon = limiteCon;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
