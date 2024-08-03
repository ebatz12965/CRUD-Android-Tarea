package com.example.crud.controladores;

import com.example.crud.modelos.Libro;

import java.util.List;

public interface ILibroBD {

    Libro elemento(int id); //Devuelve el elemento dado su id
    Libro elemento(String title); //Devuelve el elemento dado su titulo exacto

    List<List> lista(); //Devuelve todos los elementos registrados

    void agregar(Libro book); //Añade el elemento indicado
    void actualizar(int id, Libro book); //Actualiza datos del elemento dado su id

    void borrar(int id); //Elimina el elemento indicado con el id
}
