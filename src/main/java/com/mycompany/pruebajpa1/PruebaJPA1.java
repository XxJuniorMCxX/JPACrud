/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pruebajpa1;

import com.mycompany.pruebajpa1.logica.Alumno;
import com.mycompany.pruebajpa1.logica.Controladora;
import java.util.Date;

/**
 *
 * @author DREP
 */
public class PruebaJPA1 {

    public static void main(String[] args) {
        System.out.println("Controlado de Capaz");
        //ControladoraPersistencia controladoraAlumno = new ControladoraPersistencia();
        Controladora control = new Controladora();
        //dar de alta a un alumno
        Alumno alumno = new Alumno(50, "Pedro", "Castillo Torres", new Date());
//        control.crearAlumno(alumno);
        //dar de baja a un alumno
//        control.eliminarAlumno(50);
//      Editar Alumno
        alumno.setNombre("Pedro Miguel");
        control.editarAlumno(alumno);
        
    }
}
