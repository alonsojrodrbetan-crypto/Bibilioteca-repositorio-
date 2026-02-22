package com.daw.programacion.app;

import com.daw.programacion.controller.GestorMenuController;
import com.daw.programacion.model.Biblioteca;
import com.daw.programacion.model.EstadoEnum;
import com.daw.programacion.model.GeneroEnum;
import com.daw.programacion.model.Libro;

public class Main {

	public static void main(String[] args) {

		
		Biblioteca biblioteca = new Biblioteca ();
		
		Libro libro01 = new Libro("000000001","Cumbres Borrascosas","Emily Brönte",1978,"Planeta", GeneroEnum.NOVELA,
				EstadoEnum.DISPONIBLE,6,6);
	
		biblioteca.insertarLibro(libro01);
		
		GestorMenuController gmc = new GestorMenuController();
		gmc.setBiblioteca(biblioteca);
		gmc.mostrarMenu();
		
	
	
	}

}
