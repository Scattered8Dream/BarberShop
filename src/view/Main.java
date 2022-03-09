/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import Model.Pessoa;

/**
 *
 * @author edson
 */
public class Main {
    public static void main(String[] args){
        
        Servico servico = new Servico(1,"Barba",35);
        Cliente cliente = new Cliente("Rua tia Cotinha", "1236552301",1, "Moe");
        //Usuario usuario = new Usuario(0, nome, senha);
        
        Agendamento agendamento = new Agendamento(1,cliente,servico,servico.getValor(),"02/05/2022");
        
        System.out.println(servico.getDesc());
        System.out.println(servico.getValor());
        System.out.println(cliente.getNome());
        System.out.println(agendamento.getCliente().getNome());
    
    }
}
