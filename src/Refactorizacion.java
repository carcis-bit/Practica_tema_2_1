import java.util.ArrayList;
import java.util.Scanner;

public class Refactorizacion {


	public static void main(String args[]) {

		
		ArrayList<Persona> array = new ArrayList<Persona>();

		System.out.println("Comienza la ejecución");

		System.out.println("Pedir 2 personas al usuario");

		Scanner leerString = new Scanner(System.in);
		Scanner leerNumero = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			
			System.out.println("Pedir nombre");
			String nombre = leerString.nextLine();
			
			System.out.println("Pedir edad");
			int edad = leerNumero.nextInt();
			
			System.out.println("Pedir profesión");
			String profesion = leerString.nextLine();
			
			Persona p = new Persona(nombre, edad, profesion);

			array.add(p);
		}

		for (Persona p : array) {
			System.out.println("persona " + p);
		}

	}

}
