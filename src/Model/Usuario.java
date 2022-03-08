/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author edson
 */
public class Usuario extends Pessoa {
    

    protected String senha;
    protected String nvlAcesso;

    public Usuario(String senha, int id, String nome) {
        super(id, nome);
        this.senha = senha;
    }

    public Usuario(String senha, String nvlAcesso, int id, String nome, char sexo, Date dataNascimento, String telefone, String email) {
        super(id, nome, sexo, dataNascimento, telefone, email);
        this.senha = senha;
        this.nvlAcesso = nvlAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNvlAcesso() {
        return nvlAcesso;
    }

    public void setNvlAcesso(String nvlAcesso) {
        this.nvlAcesso = nvlAcesso;
    }

    
  
}
