/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reseñas;
import java.util.Date;

/**
 *
 * @author Davewaves
 */
public class Registro {

    private String Nombre;
    private String Servicio;
    private Date FechaSeleccionada;
    private int Calificacion = 0;
    private String Reseña;

    //CONSTRUCTOR
    public Registro(String Nombre, String Servicio, Date FechaSeleccionada, int Calificacion, String Reseña) {
        this.Nombre = Nombre;
        this.Servicio = Servicio;
        this.FechaSeleccionada = FechaSeleccionada;
        this.Calificacion = Calificacion;
        this.Reseña = Reseña;

    }

    //METODOS GET
    public String getNombre() {
        return Nombre;
    }

    public String getServicio() {
        return Servicio;
    }

    public Date getFechaSeleccionada() {
        return FechaSeleccionada;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public String getReseña() {
        return Reseña;
    }

    //METODOS SET
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setServicio(String Servicio) {
        this.Servicio = Servicio;
    }

    public void setFechaSeleccionada(Date FechaSeleccionada) {
        this.FechaSeleccionada = FechaSeleccionada;
    }

    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }

    public void setReseña(String Reseña) {
        this.Reseña = Reseña;
    }

    

}
