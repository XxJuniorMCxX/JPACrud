/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebajpa1.logica;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author DREP
 */
@Entity
public class Carrera implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    @OneToMany(mappedBy = "carrera")
    private List<Materia> listaMateria;

    public Carrera() {
    }

    public Carrera(int id, String nombre, List<Materia> listaMateria) {
        this.id = id;
        this.nombre = nombre;
        this.listaMateria = listaMateria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getListaMateria() {
        return listaMateria;
    }

    public void setListaMateria(List<Materia> listaMateria) {
        this.listaMateria = listaMateria;
    }

    @Override
    public String toString() {
        // Crear una lista de nombres de materias
        String materiaNombres = listaMateria != null ? listaMateria.stream()
                .map(Materia::getNombre) // Obtener los nombres de las materias
                .collect(Collectors.joining(", ")) // Unir los nombres en una cadena
                : "No hay materias";

        return "Carrera{"
                + "id=" + id
                + ", nombre='" + nombre + '\''
                + ", materias=[" + materiaNombres + "]"
                + // Incluir los nombres de las materias
                '}';
    }

}
