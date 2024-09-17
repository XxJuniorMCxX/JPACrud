/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pruebajpa1;

import com.mycompany.pruebajpa1.logica.Alumno;
import com.mycompany.pruebajpa1.logica.Carrera;
import com.mycompany.pruebajpa1.logica.Controladora;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DREP
 */
public class PruebaJPA1 {

    public static void main(String[] args) {
        System.out.println("Controlado de Capaz");
        //ControladoraPersistencia controladoraAlumno = new ControladoraPersistencia();
        Controladora control = new Controladora();
//        //dar de alta a un alumno
//        Alumno alumno = new Alumno(50, "Pedro", "Castillo Torres", new Date());
////        control.crearAlumno(alumno);
//        //dar de baja a un alumno
////        control.eliminarAlumno(50);
////      Editar Alumno
//        alumno.setNombre("Pedro Miguel");
//        control.editarAlumno(alumno);
        //mostrar alumno por id y grupal busqueda
//        control.traerAlumno(1);
//        Alumno alumno = control.traerAlumno(2);
//        System.out.println("Imprmir Alumno Individual");
//        System.out.println("El alumno es: " + alumno.toString());
//        System.out.println("Imprimir Alumnos Grupal");
//        List<Alumno> alumnosLista = control.traerLista();
//        for (Alumno alumno1 : alumnosLista) {
//             System.out.println("Lista De Alumnos: " + alumno1.toString());
//        }
//        System.out.println("------------------------------------");

        //System.out.println("Modelo Entidad - Relación");
        //Crear Carrera
        Carrera carrera = new Carrera(2, "Ingenieria Industrial");
        //Guardar Carrera en BD
        control.crearCarrera(carrera);
        
        //Crear Alumno Carrera
        Alumno alumno = new Alumno(1, "Ana", "Sernaque Tezen", new Date(), carrera);

        //guardamos el Alumno en la BD
        control.crearAlumno(alumno);

        System.out.println("Observamos Resultados");
        Alumno alumn = control.traerAlumno(3);
        System.out.println(alumn.toString());
      

    }
}
