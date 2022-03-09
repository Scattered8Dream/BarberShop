/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Pessoa;
import java.util.Date;

/**
 *
 * @author edson
 */
public class Cliente extends Pessoa {
    

    protected String endereco;
    protected String cep;

    public Cliente(String endereco, String cep, int id, String nome, char sexo, String dataNascimento, String telefone, String email) {
        super(id, nome, sexo, dataNascimento, telefone, email);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(String endereco, String cep, int id, String nome) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }

    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    
}
