package com.daw.programacion.model;

public class Libro {

	private String isbn;
	private String titulo;
	private String autor;
	private int anioPub;
	private String editorial;
	private GeneroEnum genero;
	private EstadoEnum estado;
	private int cantidadCopias;
	private int copiasDisponibles;
	
	
	public Libro(String isbn, String titulo, String autor, int anioPub, String editorial, GeneroEnum genero,
			EstadoEnum estado, int cantidadCopias, int copiasDisponibles) {
		
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.anioPub = anioPub;
		this.editorial = editorial;
		this.genero = genero;
		this.estado = estado;
		this.cantidadCopias = cantidadCopias;
		this.copiasDisponibles = copiasDisponibles;
	}
	public String getISBN() {
		return isbn;
	}
	public void setISBN(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnioPub() {
		return anioPub;
	}
	public void setAnioPub(int anioPub) {
		this.anioPub = anioPub;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public GeneroEnum getGenero() {
		return genero;
	}
	public void setGenero(GeneroEnum genero) {
		this.genero = genero;
	}
	public EstadoEnum getEstado() {
		return estado;
	}
	public void setEstado(EstadoEnum estado) {
		this.estado = estado;
	}
	public int getCantidadCopias() {
		return cantidadCopias;
	}
	public void setCantidadCopias(int cantidadCopias) {
		this.cantidadCopias = cantidadCopias;
	}
	public int getCopiasDisponibles() {
		return copiasDisponibles;
	}
	public void setCopiasDisponibles(int copiasDisponibles) {
		this.copiasDisponibles = copiasDisponibles;
	}
	
	
	
	
}
