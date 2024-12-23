package Implementacion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Dominio.Casas;
import Interface.Metodos;

public class LogicaMetodos implements Metodos {

	private List<Casas> lista = new ArrayList<Casas>();

	@Override
	public void guardar(Casas casa) {
		// TODO Auto-generated method stub
		//validar para que no se repita el numero de casa al guardar
		//con bandera de tipo booleana
		boolean bandera = false; 
		for (Casas c : lista) {
			if (c.getNumeroCasa() == casa.getNumeroCasa()) {
				System.out.println("Ya existe ese num. de casa");
				bandera = true;
				break;
				
			}	
		}
		if (bandera == false) {
			lista.add(casa);
			System.out.println("Se guardo el registro");
			
			
		}
	
	}

	@Override
	public List<Casas> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Casas buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void editar(int indice, Casas casa) {
		// TODO Auto-generated method stub
		lista.set(indice, casa);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

	@Override
	public Casas buscarxnumCasa(int numCasa) {
		// TODO Auto-generated method stu
		// CICLO Y CONDICIÓN
		// para comparar el numero de casa si es igual al valor buscado por numero de
		// casa
		// VALIDAR
		for (Casas c : lista) {
			if (c.getNumeroCasa() == numCasa) {
				return c;
			}
		}
		return null;
	}

	@Override
	public Casas buscarxTipo(String tipoCasa) {
		
		
		boolean bandera = false;
for (Casas c : lista) {
	if (c.getTipoCasa().equals(tipoCasa)) {
		System.out.println(c);
		bandera = true;
		System.out.println("la casa es");

	} 

	if ((bandera == false)) {
		
	}
	}
		// TODO Auto-generated method stub
		return null;
	}

	
	
	@Override
	public void calculardineroinvertido(float precio) {
		// TODO Auto-generated method stub
		
		//ciclo 
		//iniciar variable 
		
	
	
		
	}

	@Override
	public void eliminarxnumCasa(int numCasa) {
		// TODO Auto-generated method stub

		// Ciclo y condicion
		
		boolean bandera = false;
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNumeroCasa() == numCasa) {
				lista.remove(i);
				bandera = true;
				System.out.println("Se elimino con exito");
				break; // Detiene por completo la iteracion para no seguir buscando registros.
			}

		}
		if (bandera == false) {
			System.out.println("Ese registro no existe");
		}

	}

	@Override
	public void editarXnumCasa(int numCasa, Casas casa) {
		// TODO Auto-generated method stub
		
		//lista.set(numCasa, casa); //con este almacena 
		//Usamos un ciclo
		//FALTA VALIDAR 
		for (int i = 0; i<lista.size(); i++) {
			if (numCasa == lista.get(i).getNumeroCasa()) {
				lista.set(i, casa);		
				break;
				}
			
		}
		

	}



}
