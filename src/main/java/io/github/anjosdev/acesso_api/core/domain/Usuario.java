package io.github.anjosdev.acesso_api.core.domain;

public class Usuario {
    private Long id;
    private String email;
    private String senha;
    private Boolean adm;
    private Pessoa pessoa;


    public Usuario() {
    }

    public Usuario(Long id, String email, String senha, Boolean adm, Pessoa pessoa) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.adm = adm;
        this.pessoa = pessoa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
