/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebajpa1.logica;

import com.mycompany.pruebajpa1.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;

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

    public void editarAlumno(Alumno alumno) {
        controlPersistencia.editarAlumno(alumno);
    }

    public Alumno traerAlumno(int id) {
        return controlPersistencia.traerAlumno(id);
    }

    public List<Alumno> traerLista() {
        return controlPersistencia.traerLista();
    }

    //Datos de la Carrera & Alumno
    public void crearCarrera(Carrera carrera) {
        controlPersistencia.crearCarrera(carrera);
    }

    public void eliminarCarrera(int id) {
        controlPersistencia.eliminarCarrera(id);
    }

    public void editarCarrera(Carrera carrera) {
        controlPersistencia.editarCarrera(carrera);
    }

    public Carrera traerCarrera(int id) {
        return controlPersistencia.traerCarrera(id);
    }

//    public List<Carrera> traerListaCarreras() {
//        return controlPersistencia.traerListaCarreras();
//    }
    public ArrayList<Carrera>traerCarreras(){
        return controlPersistencia.TraerListaCarreras();
    }
    
 

}
