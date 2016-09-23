package br.ufpb.cc.mps.lab2.business.model;

import java.io.Serializable;

/**
 * Created by Gustavo Sampaio and Cicero Marcelo on 9/15/16.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String login;
    private String senha;

    public User() {
        this.login = "";
        this.senha = "";
    }

    public User(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Login: " + login + " Senha: " + senha;
    }
}
