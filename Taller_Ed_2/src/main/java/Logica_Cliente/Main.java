/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Libro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        ArrayList<Libro> libros = new ArrayList<>();
        String libro;

        System.out.println("---BIBLIOTECA---");
        System.out.println("Digite el numeros de libros a registrar: ");
        int numLibros = lec.nextInt();
        lec.nextLine();
        for (int i = 0; i < numLibros; i++) {
            System.out.println("Ingrese el libro: " + (i + 1));
            libro = lec.nextLine();
            Libro objlibro = new Libro(libro);
            libros.add(objlibro);
        }
        
        OrdenamientoInsercion(libros);
        for (Libro books : libros) {
            System.out.println(books);
        }

    }

   public static void OrdenamientoInsercion(ArrayList<Libro> libros) {
    for (int i = 1; i < libros.size(); i++) {
        boolean agregado = false;
        for (int j = i - 1; j >= 0 && !agregado; j--) {
            Libro primera = libros.get(j);
            Libro segunda = libros.get(j + 1);
            if (primera.getTitulo().compareTo(segunda.getTitulo()) > 0) {
                libros.set(j, segunda);
                libros.set(j + 1, primera);
            } else {
                agregado = true;
            }
        }
    }
}

}
