/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author edson
 */
public class Servico {
    private int  id;
    private String desc;
    private float valor;

    public Servico(int id, String desc, float valor) {
        this.id = id;
        this.desc = desc;
        this.valor = valor;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getValor() {
        return valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString(){
        return getDesc();
    }
}
