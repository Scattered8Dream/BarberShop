/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import ControllerHelper.AgendamentoHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import java.util.ArrayList;
import view.Agenda;

/**
 *
 * @author edson
 */
public class AgendaController {
    private final Agenda view;
    private final AgendamentoHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendamentoHelper(view);
    }

    
    public void atualizaTabela(){
        /*1 Buscar lista com agendamentos do banco de dados*/
        AgendamentoDAO agendamento =  new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamento.selectAll();
        
        /*2 Exibir a lista na view*/
        helper.preencheTabela(agendamentos);
    }

    public void atualizaCliente(){
        //Buscar clientes do banco
        ClienteDAO clienteDAO =  new ClienteDAO();
        ArrayList<Cliente> listaClientes = clienteDAO.selectAll();
        //Exibir cliente no combobox
        helper.preencherClientes(listaClientes);
    }
    
    public void atualizaServico(){
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        helper.preencherServicos(servicos);
    }
    
    public void atualizaValor(){
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }
}
