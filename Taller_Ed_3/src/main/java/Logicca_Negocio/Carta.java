package Logicca_Negocio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Carta {
    public int Valor;

    public Carta() {
    }

    public Carta(int Valor) {
        this.Valor = Valor;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }
    @Override
    public String toString() {
    return "Valor: " + this.Valor; 
    }
    
}
