package com.daw.programacion.controller;

import com.daw.programacion.view.Consola;

public class GestorMenuController {
	private Consola menu = new Consola ();
	
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
			menu.introducirISBN ();
			break;
		case 2: 
			menu.introducirTitulo ();
			break;
		case 3: 
			menu.introducirAutor();
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
	
	
	
}
