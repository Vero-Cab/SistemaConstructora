package Interface;

import java.util.List;

import Dominio.Casas;

public interface Metodos {
	
	//crear el CRUD CON METODOS DE PROCEDIMIENTOS Y FUNCIONES
	
	public void guardar(Casas casa);
	
	public List<Casas> mostrar();
	
	public Casas buscar (int indice);
	
	public void editar (int indice, Casas casa);
	
	public void eliminar (int indice);


	public Casas buscarxnumCasa(int numCasa);
	
	
	public Casas buscarxTipo(String tipoCasa);
	
	//metodo por procedimiento
	public void calculardineroinvertido (float precio);
	
	public void eliminarxnumCasa (int numCasa);
	
	public void editarXnumCasa (int numCasa, Casas casa);
	
	
	
	
	
	
	
	
	
	
	
	

}
