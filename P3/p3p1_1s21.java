import java.util.Scanner;
public class p3p1_1s21{
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args){
		menu();

		String opc = teclado.nextLine();
		if (opc.equals("A"))suma();
		if (opc.equals("B"))resta();
		if (opc.equals("C"))multiplicacion();
		if (opc.equals("D"))division();
	
	}
	public static void menu(){

	System.out.println("operaciones basicas");
		System.out.println("\n A) suma");
		System.out.println("\n B) resta");
		System.out.println("\n C)multiplicacion");
		System.out.println("\n D)division");
		System.out.println("\n que opcion deseas");

		
	}

    public static void suma(){

      	System.out.println("suma de 2 numeros");
		System.out.println("ingresa el 1er numero");
		int a = teclado.nextInt();
		System.out.println("ingresa el 2do numero");
		int b = teclado.nextInt();
		int c = a+b;
		System.out.println("la suma fue "+ c);

	}
	public static void resta(){

		System.out.println("resta de 2 numeros");
		System.out.println("ingresa el 1er numero");
		int a = teclado.nextInt();
		System.out.println("ingresa el 2do numero");
		int b = teclado.nextInt();
		int c = a-b;
		System.out.println("la resta es "+ c);
	}
	public static void multiplicacion(){
		System.out.println("multiplicacion de 2 numeros");
		System.out.println("ingresa el 1er numero");
		int a = teclado.nextInt();
		System.out.println("ingresa el 2do numero");
		int b = teclado.nextInt();
		int c = a*b;
		System.out.println("la resta es "+ c);
	}
	public static void division(){
		System.out.println("division de 2 numeros");
		System.out.println("ingresa el 1er numero");
		int a = teclado.nextInt();
		System.out.println("ingresa el 2do numero");
		int b = teclado.nextInt();
		int c = a/b;
		System.out.println("la resta es "+ c);
	}
		
}

	
	
