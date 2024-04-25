/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logicca_Negocio.Carta;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Main {

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        ArrayList<Carta>Cartas= new ArrayList<>();

        int carta = 0;
        
        System.out.println("----CORAZONES----");
        for (int i = 0; i < 8; i++) {
            
            System.out.println("Ingrese el valor de la carta ");
            carta = lec.nextInt();
            Carta objCarta = new Carta(carta);
            Cartas.add(objCarta);
            
        }
        OrdenamientoBurbuja(Cartas);

        for (Carta Carta1 : Cartas) {
            System.out.println(Carta1);
        }
    }

    //ordenamiento burbuja
    public static void OrdenamientoBurbuja(ArrayList<Carta> Cartas) {
        int cantidad = Cartas.size();

        for (int i = 0; i < cantidad - 1; i++) {
            for (int j = 0; j < cantidad - i - 1; j++) {
                Carta primera = Cartas.get(j);
                Carta segundo = Cartas.get(j+1);

                if (primera.getValor() > segundo.getValor()) {
                    Cartas.set(j, segundo);
                    Cartas.set(j + 1, primera);
                }
            }
        }

    }

}
