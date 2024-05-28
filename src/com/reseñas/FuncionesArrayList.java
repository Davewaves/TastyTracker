/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reseñas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Davewaves
 */
public class FuncionesArrayList {
    
    private static final ArrayList<Registro> registros = new ArrayList<>();
    //Funcion para agregar registro
    public static void agregarRegistro(Registro registro) {
        registros.add(registro);
    }
    
    //funcion para eliminar registro
    public static void eliminarRegistro(int e) {
        if (e >= 0 && e < registros.size()) {
            registros.remove(e);
        
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona un registro para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //actualizar registro
    public static void editarRegistro(Registro registro, int e) {
        registros.set(e, registro);
    }    
    
    public static ArrayList<Registro> getRegistros() {
        return new ArrayList<>(registros); // Devuelve una copia para evitar modificaciones directas
    }
    
}
