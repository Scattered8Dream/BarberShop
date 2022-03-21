/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControllerHelper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import view.Agenda;

/**
 *
 * @author edson
 */
public class AgendamentoHelper {
    private final Agenda view;

    public AgendamentoHelper(Agenda view) {
        this.view = view;
    }

    public void preencheTabela(ArrayList<Agendamento> agendamentos) {
        
       DefaultTableModel tableModel = (DefaultTableModel) view.getTable().getModel();
       tableModel.setNumRows(0);
       
        //Percorrer a lista para preencher a tabela
        for (Agendamento agendamento : agendamentos) {
         
            tableModel.addRow(new Object[]{
                
                agendamento.getId(),
                agendamento.getCliente(),
                agendamento.getServico(),
                agendamento.getObservacao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada()
            });
        }
    }

    public void preencherClientes(ArrayList<Cliente> listaClientes) {
       DefaultComboBoxModel comboBoxClienteModel = (DefaultComboBoxModel) view.getjComboBoxNome().getModel();
       
        for (Cliente listaCliente : listaClientes) {
            comboBoxClienteModel.addElement(listaCliente);
        }
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
       DefaultComboBoxModel comboBoxServicoModel = (DefaultComboBoxModel) view.getjComboServico().getModel();
       
        for (Servico servico : servicos) {
            comboBoxServicoModel.addElement(servico);
        }
    }

    public Servico obterServico() {
        return (Servico) view.getjComboServico().getSelectedItem();
        
    }

    public void setarValor(float valor) {
        view.getjTextValor().setText(valor+"");
    }
    
}