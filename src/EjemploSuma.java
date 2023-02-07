
public class EjemploSuma {
	
	static int sumar (int a, int b) {
	return a+b;
	 }
	
    public static void main(String[] args) {
      int i = 1;
      int j = 5;
      int suma = sumar(i,j);
      
      System.out.println("Ejercicio Muestra Suma");  
      System.out.println("-----------------------------------");
      System.out.println(i + " + " + j +" = "+suma);
      System.out.println("Fin Ejercicio");
    }
}
