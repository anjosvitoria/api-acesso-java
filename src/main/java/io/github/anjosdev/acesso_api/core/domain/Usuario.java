package io.github.anjosdev.acesso_api.core.domain;

public class Usuario {
    private long id;
    private String email;
    private String senha;
    private Boolean adm;
    private long idPessoa;


    public Usuario() {
    }

    public Usuario(long id, String email, String senha, Boolean adm) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.adm = adm;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAdm() {
        return adm;
    }

    public void setAdm(Boolean adm) {
        this.adm = adm;
    }
}
