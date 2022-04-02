/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author Miguel
 */
public class Funcion {
    String hora;
    Date fecha;
    String pelicula;
    String sala;

    public Funcion(String hora, Date fecha, String pelicula, String sala) {
        this.hora = hora;
        this.fecha = fecha;
        this.pelicula = pelicula;
        this.sala = sala;
    }
            
}
