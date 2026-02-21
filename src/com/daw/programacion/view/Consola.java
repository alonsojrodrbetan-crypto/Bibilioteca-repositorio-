package com.daw.programacion.view;

import java.util.Scanner;

public class Consola {
 // Normalmente, la consola se va a comunicar con el controlador tanto para recibir como para enviar información.
	
	public int mostrarMenuPrincipal () {

		Scanner sc = new Scanner (System.in);
		int opcion = 0;
		
		do {
			
			System.out.println("******************************");
			System.out.println("****** MENÚ PRINCIPAL ********");
			System.out.println("******************************");
			System.out.println("**** 1. Prestar un libro *****");
			System.out.println("**** 2. Devolver un libro ****");
			System.out.println("**** 3. Reservar un libro ****");
			System.out.println("**** 4. Buscar un libro ******");
			System.out.println("5. Encontrar un libro prestado");
			System.out.println("** 6. Resumen de Biblioteca **");
			System.out.println("********   7. SALIR   ********");
			System.out.println("******************************");
			
			System.out.println(" Seleccione la opción deseada: ");
			opcion = sc.nextInt ();
		
		
		} while (opcion<1||opcion>7);
		
		return opcion;
	}
	
	public int mostrarMenuBuscar () {
		
		Scanner sc = new Scanner (System.in);
		int opcion = 0;
		
		do {
		
			System.out.println("******************************");
			System.out.println("**** MENÚ BUSCAR LIBRO ********");
			System.out.println("******************************");
			System.out.println("**** 1. Buscar por ISBN ******");
			System.out.println("**** 2. Buscar por título ****");
			System.out.println("**** 3. Buscar por autor *****");
			System.out.println("******  4. VOLVER ATRÁS  *****");
			System.out.println("******************************");
			
			
			System.out.println(" Seleccione la opción deseada: ");
			opcion = sc.nextInt ();
	
		
		} while (opcion<1||opcion>4);
		
		return opcion;
		
	}
	
	public int mostrarMenuResumen () {
		
		Scanner sc = new Scanner (System.in);
		int opcion = 0;
		
		do {
		
			System.out.println("******************************");
			System.out.println("**** MENÚ TIPO RESUMEN ********");
			System.out.println("******************************");
			System.out.println("*** 1. Resumen de Libros ******");
			System.out.println("*** 2. Resumen de Usuarios ****");
			System.out.println("******  3. VOLVER ATRÁS  *****");
			System.out.println("******************************");
			
			
			System.out.println(" Seleccione la opción deseada: ");
			opcion = sc.nextInt ();
	
		
		} while (opcion<1||opcion>3);
		
		return opcion;
	}
	
	public String introducirISBN () {
		
		System.out.println(" Indique el ISBN del libro: ");
		Scanner lector = new Scanner (System.in);
		String isbn = lector.nextLine();
		return isbn;
		
	}
	
	public String registrarDNIUsuario () {
		
		System.out.println(" Indique su DNI ");
		Scanner lector = new Scanner (System.in);
		String dniUsuario = lector.nextLine();
		return dniUsuario;
		
	}
	
	public String introducirTitulo () {
		
		System.out.println(" Indique el título del libro: ");
		Scanner lector = new Scanner (System.in);
		String titulo = lector.nextLine();
		return titulo;
		
	}
	
	public String introducirAutor () {
		
		System.out.println(" Indique el autor del libro: ");
		Scanner lector = new Scanner (System.in);
		String autor = lector.nextLine();
		return autor;
		
	}
	
}
