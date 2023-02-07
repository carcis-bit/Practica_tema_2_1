
public class EjemploSuma {
	
	static int sumar (int a, int b, int c) {
	return a+b+c;
	 }
	
    public static void main(String[] args) {
      int i = 4;
      int j = 7;
      int x = 5;
      int suma = sumar(i,j,x);
      
      System.out.println("Ejercicio Muestra Suma");  
      System.out.println("-----------------------------------");
      System.out.println(i + " + " + j +" = "+suma);
      System.out.println("Fin Ejercicio");
    }
}
