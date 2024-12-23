package Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Dominio.Casas;
import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar las variables
		Scanner lectura = null; // el scanner lo usamos muchas veces en null para no perder

		int numeroCasa, menuPrinc, subMenu, indice;
		float precio;
		String tipoCasa;
		String dimensiones;

		Casas casa = null;

		// Instancia de clase para tener acceso a los metodos de LogicaMetodos
		LogicaMetodos imp = new LogicaMetodos();

		do {

			System.out.println("MENU PRINCIPAL");
			System.out.println("1----- ALTA");
			System.out.println("2----- MOSTRAR");
			System.out.println("3------BUSCAR");
			System.out.println("4------EDITAR ");
			System.out.println("5----- ELIMINAR");
			System.out.println("6----- Buscar por NUM.CASA");
			System.out.println("7----- Buscar por tipo");
			System.out.println("8----- Calcular dinero invertido");
			System.out.println("9----- Eliminar por NUM. CASA");
			System.out.println("10---- Editar buscando por NUM. CASA");
			System.out.println("11----- Salir");

			lectura = new Scanner(System.in);
			menuPrinc = lectura.nextInt();

			switch (menuPrinc) {
			case 1:
				try {
					System.out.println("Ingresa el numero de casa");
					lectura = new Scanner(System.in);
					numeroCasa = lectura.nextInt();

					System.out.println("Ingresa el precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();

					System.out.println("Ingresa el tipo de casa");
					lectura = new Scanner(System.in);
					tipoCasa = lectura.nextLine();

					System.out.println("Ingrese las dimensiones");
					lectura = new Scanner(System.in);
					dimensiones = lectura.nextLine();

					// Declarar el objeto con todos los atributos
					casa = new Casas(numeroCasa, precio, tipoCasa, dimensiones);

					// Agregar a la lista
					imp.guardar(casa);
					// System.out.println("se guardo con exito");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar " + e.getMessage());
				}
				break;

			case 2:
				// System.out.println(imp.mostrar());
				// imp.mostrar(); ya me trae una lista

				if (imp.mostrar().size() > 0) {

					System.out.println(imp.mostrar());

				} else {
					System.out.println("No hay registross en la lista");
				}
				System.out.println();

				break;

			case 3:
				try {
					System.out.println("ingresa el indice a buscar");

					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// buscar
					System.out.println(imp.buscar(indice));

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar");
				}
				break;

			case 4:
				// para Editar
				try {
					System.out.println("Ingresa el indice a editar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// buscar
					casa = imp.buscar(indice); // este registro que trae imp almacena en variable
					System.out.println("se encontro " + casa);

					// Editar-----SubMenu-------numCasa, precio

					do {
						System.out.println("SUB MENU PARA EDITAR");
						System.out.println("1.---- NUM. CASA");
						System.out.println("2.---- PRECIO");
						System.out.println("3.----- REGRESA MENU PRINCIPAL");

						lectura = new Scanner(System.in);
						subMenu = lectura.nextInt();

						switch (subMenu) {
						case 1:
							System.out.println("Ingresa el nuevo numero de casa");
							lectura = new Scanner(System.in);
							numeroCasa = lectura.nextInt();

							// ACTULIZACION de numero de casa
							casa.setNumeroCasa(numeroCasa);
							imp.editar(indice, casa);
							System.out.println("se edito");
							break;

						case 2:
							System.out.println("Ingresa el nuevo precio");
							lectura = new Scanner(System.in);
							precio = lectura.nextFloat();

							// Actualización de precio
							casa.setPrecio(precio);
							imp.editar(indice, casa);
							System.out.println("se edito el precioo");

							break;

						case 3:
							break;

						}

					} while (subMenu < 3);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar para editar");

				}

				break;

			case 5:
				// para Eliminar
				try {

					System.out.println("Ingresa el indice a eliminar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// eliminar
					imp.eliminar(indice);
					System.out.println("se elimino bien");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al eliminar");

				}

				break;

			case 6:
				// Para Buscar por num. de casa
				// TRY POR QUE PUEDE TRONAR
				try {

					System.out.println("Ingresa el Num. de casa a buscar");
					lectura = new Scanner(System.in);
					numeroCasa = lectura.nextInt();

					// Buscar
					casa = imp.buscarxnumCasa(numeroCasa);
					// VALIDAR para num de casa
					if (casa == null) {
						System.out.println("No existe el numero de casa");

					} else {
						System.out.println("Numero de casa encontrado " + casa);

					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar por numero de casa");

				}

				break;

			case 7: // buscar por tipo de casa
				try {

					System.out.println("Ingresa el tipo de casa para buscar");
					lectura = new Scanner(System.in);
					tipoCasa = lectura.next();

					casa = imp.buscarxTipo(tipoCasa);
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar por tipo de casa");
				}
				break;

			case 8:// Calcular dinero invertido
				
				// Dinero INVERTIDO
				
				
				
				
				break;

			case 9:
				// eliminar por numero de casa
				try {
					System.out.println("Ingresa el numero de Casa a eliminar");
					lectura = new Scanner(System.in);
					numeroCasa = lectura.nextInt();

					// Eliminar
					imp.eliminarxnumCasa(numeroCasa);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al eliminar");

				}

				break;

			case 10: // editar buscando por numero de casa

				try {
					System.out.println("Ingresa el numero de casa para editar");
					lectura = new Scanner(System.in);
					numeroCasa = lectura.nextInt();

					// buscar
					casa = imp.buscarxnumCasa(numeroCasa); // este registro que trae imp almacena en variable
					System.out.println("se encontro " + casa);

					System.out.println("Ingrese el Nuevo Precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();

					// Actualización de precio
					casa.setPrecio(precio);
					imp.editarXnumCasa(numeroCasa, casa);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al editar: " + e.getMessage());

				}

				break;

			case 11:

				break;

			}

		} while (menuPrinc < 11);

	}

}
