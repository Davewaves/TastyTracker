/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reseñas;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Davewaves
 */
public class FuncionesArrayList {
    
    // ESTE FRAME CONTIENE TODOS LOS METODOS Y FUNCIONES CON LAS QUE SE AGREGAN
    // ELIMINAN, SE CARGAN A LA TABLA LOS REGISTROS DE LOS ARRAYLIST

    private static final ArrayList<Registro> registros = new ArrayList<>();
    private static final String FILE_PATH = "reseñas.dat";

    // FUNCION AGREGAR REGISTRO
    public static void agregarRegistro(Registro registro) {
        registros.add(registro);
        guardarRegistros();
    }
    
    

    // FUNCION ELIMINAR REGISTROS
    public static void eliminarRegistro(int e) {
        if (e >= 0 && e < registros.size()) {
            registros.remove(e);
            guardarRegistros();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona un registro para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // FUNCION ACTUALIZAR REGISTRO
    public static void editarRegistro(Registro registro, int e) {
        if (e >= 0 && e < registros.size()) {
            registros.set(e, registro);
            guardarRegistros();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona un registro para editar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static ArrayList<Registro> getRegistros() {
        return new ArrayList<>(registros); 
    }

    // METODO PARA GUARDAR LOS REGISTROS
    public static void guardarRegistros() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(registros);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // CARGAR LOS REGISTROS
    public static void cargarRegistros() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            ArrayList<Registro> loadedRegistros = (ArrayList<Registro>) ois.readObject();
            registros.clear();
            registros.addAll(loadedRegistros);
        } catch (FileNotFoundException e) {
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
