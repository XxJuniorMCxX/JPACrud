/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pruebajpa1;

import com.mycompany.pruebajpa1.logica.Alumno;
import com.mycompany.pruebajpa1.logica.Carrera;
import com.mycompany.pruebajpa1.logica.Controladora;
import com.mycompany.pruebajpa1.logica.Materia;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author DREP
 */
public class PruebaJPA1 {

    public static void main(String[] args) {
        System.out.println("Controlado de Capaz");
        Controladora control = new Controladora();
        
        //creamos lista de materias y las agregamos
        List<Materia> listaMaterias = new ArrayList<>();
        
        //creamos carrera con lista de materias 
        Carrera carrera = new Carrera(1, "Tecnicatura en Programación", listaMaterias);
        
        //Guardamos Carrera en BD
        control.crearCarrera(carrera);
        
        
        //Crear Materias
        Materia mate1 = new Materia(1, "Programación I", "Cuatrimestral",carrera);
        Materia mate2 = new Materia(2, "Programación II", "Cuatrimestral",carrera);
        Materia mate3 = new Materia(3, "Programación Avanzada", "Anual",carrera);
        
        
        //Guardados En BD
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
        //Agregamos Lista De Materias
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        
        
        //seteamos datos de carrera
        carrera.setListaMateria(listaMaterias);
        control.editarCarrera(carrera);
        
        //Crear Alumno Con La Carrera
        Alumno alumno = new Alumno(1, "Junior", "Castillo Yarlequé", new Date(), carrera);
        //Guardamos Alumno en La Base De Datos
        control.crearAlumno(alumno);
        
        //Vemos Resultado
        System.out.println("******************");
        System.out.println("--------Datos Alumno----------");
        control.traerAlumno(1);
        System.out.println("Alumno " + alumno.toString());
       
    }
}
