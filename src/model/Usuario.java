/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author marcosfilipi
 */
public class Usuario {
    

     private int id_usuario;
     private String login;
     private String senha;
     private String senhacripto;
     private String cpf;
     private String telefone;

 public String getCpf() {

     System.out.println(cpf);
        return cpf;
    }

public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
 public String getTelefone() {
     System.out.println(telefone);
        return telefone;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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

    public String getSenhacripto() {
        return senhacripto;
    }

    public void setSenhacripto(String senhacripto) {
        this.senhacripto = senhacripto;
    }



    
}
