/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControllerHelper;

import Model.Usuario;
import view.Login;

/**
 *
 * @author edson
 */
public class LoginHelper {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }

    public Usuario obterModelo(){
        //O sistema via ter que pegar o usuário da View
        //Vou buscar o usuário no banco
        //Se os dados do usuário da view baterem com os do banco o sistema vai para o menu
        //Senão mostrar a mensagem usuário ou senha inválidos
        
        String login = view.getCampoLogin().getText();
        String senha = view.getCampoSenha().getText();
        
        Usuario modelo = new Usuario(senha,0,login);
        
        return modelo;
    }

    public void SetModelo(Usuario modelo){
        
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getCampoLogin().setText(nome);
        view.getCampoLogin().setText(senha);
    }


    public void LimparTela(){
        view.getCampoLogin().setText("");
        view.getCampoSenha().setText("");
    }
}
