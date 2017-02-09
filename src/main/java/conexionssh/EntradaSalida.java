package conexionssh;

import java.util.Scanner;

public class EntradaSalida {

	/**
	 * Muestra el menú con las opciones del programa
	 */
	public static void mostrarMenu ()
	{
		System.out.println("Elija una opción: ");
		System.out.println("1. Listar patologías");
		System.out.println("2. Listar síntomas");
		System.out.println("3. Buscar patologías por nombre");
		System.out.println("4. Buscar síntomas por nombre");
		System.out.println("5. Buscar lista patologías por síntomas");
		System.out.println("6. Listar síntomas de una patología");
		System.out.println("7. Salir");
	}
	
	/**
	 * Pide un número de tipo entero al usuario 
	 * @return El número que el usuario introduce por teclado
	 */
	public static int pedirOpcion ()
	{
		int opcion = 0;
		Scanner sc = null;
		
			sc = new Scanner(System.in);
			opcion = sc.nextInt();
			
		return opcion;
	}
	
	/**
	 * Pide un nombre al usuario 
	 * @return El nombre que el usuario introduce por teclado
	 */
	public static String pedirNombre ()
	{
		String nombre = null;
		Scanner sc = null;
		
			sc = new Scanner(System.in);
			System.out.println("Introduzca el nombre: ");
			nombre = sc.nextLine();
			
		return nombre;
	}
}