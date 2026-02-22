package com.daw.programacion.controller;

import com.daw.programacion.model.Biblioteca;
import com.daw.programacion.model.Libro;
import com.daw.programacion.view.Consola;

public class GestorMenuController {
	private Consola menu = new Consola ();
	private Biblioteca biblioteca;
	
	public void mostrarMenu () {
		
		int option = menu.mostrarMenuPrincipal();
		
		switch (option) {
		case 1:
			realizarPrestamo();
			break;
		case 2: 
			devolverPrestamo();
			break;	
		case 3: 
			reservarLibro();
			break;	
		case 4: 
			controlarMenuBuscar();
			break;	
		case 5: 
			break;	
		case 6: 
			controlarMenuResumenBiblioteca();
			break;	
		case 7: 
			break;	
		}
	
	}
	
	public void controlarMenuBuscar() {
		
		int opcion = menu.mostrarMenuBuscar();
		
		switch(opcion) {
		case 1:
			String isbn = menu.introducirISBN ();
			if (isbn.equals("")) {
				menu.mostrarError("Error: El dato introducido no puede ser vacío.");
				controlarMenuBuscar();
			}else {
				
				for (Libro libro : biblioteca.getLibros()) {
					if (isbn.equals(libro.getISBN())) {
						String info = ("Autor: "+libro.getAutor()+"\n"+libro.getISBN());
						menu.mostrarLibro(info);
					}	
				}
			}
	
			break;
		case 2: 
			String titulo = menu.introducirTitulo ();
			break;
		case 3: 
			String autor = menu.introducirAutor();
			break;
		case 4: 
			mostrarMenu();
			break;
		}
		
	}
	
	
	public void controlarMenuResumenBiblioteca() {
		
		int opcion = menu.mostrarMenuResumen();
		
		switch(opcion) {
		case 1: 
			break;
		case 2: 
			break;
		case 3: 
			mostrarMenu();
			break;
		}
		
	}
	
	public void realizarPrestamo () {
		
		String isbn = menu.introducirISBN();
		String dni = menu.registrarDNIUsuario();
	}
	
	public void devolverPrestamo () {
	
		String isbn = menu.introducirISBN();
		String dni = menu.registrarDNIUsuario();
	}
	
	
	public void reservarLibro () {
	
		String isbn = menu.introducirISBN();
		// TODO
		String estado = "Prestado";
	}
	
	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}

	
}
