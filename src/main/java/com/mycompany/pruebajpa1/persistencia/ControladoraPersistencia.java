/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebajpa1.persistencia;

import com.mycompany.pruebajpa1.logica.Alumno;
import com.mycompany.pruebajpa1.logica.Carrera;
import com.mycompany.pruebajpa1.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DREP
 */
public class ControladoraPersistencia {

    AlumnoJpaController alumnoJPA = new AlumnoJpaController();
    CarreraJpaController carreraJPA = new CarreraJpaController();

    public void crearAlumno(Alumno alumno) {
        alumnoJPA.create(alumno);
    }

    public void eliminarAlumno(int id) {
        try {
            alumnoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alumno) {
        try {
            alumnoJPA.edit(alumno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public Alumno traerAlumno(int id) {
        return alumnoJPA.findAlumno(id);
    }

    public List<Alumno> traerLista() {
        return alumnoJPA.findAlumnoEntities();
    }

    public void crearCarrera(Carrera carrera) {
        carreraJPA.create(carrera);
    }

    public void eliminarCarrera(int id) {
        try {
            carreraJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera carrera) {
        try {
            carreraJPA.edit(carrera);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carreraJPA.findCarrera(id);
    }

//    public List<Carrera> traerListaCarreras() {
//        return carreraJPA.findCarreraEntities();
//    }
    public ArrayList<Carrera>TraerListaCarreras(){
        List<Carrera>lista=carreraJPA.findCarreraEntities();
        ArrayList<Carrera> listaCarreras = new ArrayList<>(lista);
        return listaCarreras;
    }
}
