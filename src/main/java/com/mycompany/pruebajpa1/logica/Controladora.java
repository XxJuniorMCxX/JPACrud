/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebajpa1.logica;

import com.mycompany.pruebajpa1.persistencia.ControladoraPersistencia;

/**
 *
 * @author DREP
 */
public class Controladora {

    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();

    public void crearAlumno(Alumno alumno) {
        controlPersistencia.crearAlumno(alumno);
    }
    public void eliminarAlumno(int id) {
        controlPersistencia.eliminarAlumno(id);
    }
    public void editarAlumno(Alumno alumno){
        controlPersistencia.editarAlumno(alumno);
    }
}
