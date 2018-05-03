package modelo;

import java.util.ArrayList;

public class Proyecto {

	private String nombre;
	private ArrayList<Alumno> integrantes;
	private String url;
	private double nota;
	private int a�o;
	private int curso;
	private String grupo;
	private int ciclo;
	
	
	public Proyecto(String nombre, ArrayList<Alumno> integrantes, String url, double nota, int a�o, int curso,
			String grupo, int ciclo) {
		this.nombre = nombre;
		this.integrantes = integrantes;
		this.url = url;
		this.nota = nota;
		this.a�o = a�o;
		this.curso = curso;
		this.grupo = grupo;
		this.ciclo = ciclo;
	}


	public String getNombre() {
		return nombre;
	}


	public ArrayList<Alumno> getIntegrantes() {
		return integrantes;
	}


	public String getUrl() {
		return url;
	}


	public double getNota() {
		return nota;
	}


	public int getA�o() {
		return a�o;
	}


	public int getCurso() {
		return curso;
	}


	public String getGrupo() {
		return grupo;
	}


	public int getCiclo() {
		return ciclo;
	}
	
	
	
	
	
	
	
	
}
