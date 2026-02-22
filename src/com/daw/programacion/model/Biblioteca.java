package com.daw.programacion.model;

import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Libro> libros;
	
	
	public Biblioteca () {
		libros = new ArrayList<Libro>();
		
	}
	
	public void insertarLibro(Libro libro) {
		this.libros.add(libro);
	}


	public ArrayList<Libro> getLibros() {
		return libros;
	}
	
}
