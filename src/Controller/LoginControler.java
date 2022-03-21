/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import ControllerHelper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import view.Login;
import view.MenuPrincipal;

/**
 *
 * @author edson
 */
public class LoginControler {
    
    private final Login view;
    private  LoginHelper helper;
    
    public LoginControler(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistemas(){

       //Pega um usuário da view
       Usuario usuario = helper.obterModelo();
       
       //Pesquisa usuário no banco
       UsuarioDAO usuarioDAO = new UsuarioDAO();
       Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
       
       if(usuarioAutenticado != null){
          MenuPrincipal menu = new MenuPrincipal();
          menu.setVisible(true);
          this.view.dispose();
       }
       else{
           view.ExibeMensagem("Usuário ou senha inválidos!");
       }
        
    }
    public void imprime(){
        System.out.println("Busquei algo no banco");
        
        this.view.ExibeMensagem("Executei o imprime");
    }
    
}
