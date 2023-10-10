import java.util.Scanner;

public class p13_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String operacion;
		int num1;
		int num2;
		int resultado;

		System.out.println("Programa que realiza operaciones basicas");
		System.out.println("Que operacion desea: Suma, Resta, Division, Multiplicacion");
			operacion = teclado.nextLine();

		if(operacion.equals("Suma")){
			System.out.println("aqui haremos una suma");
			System.out.println("Ingresa el primer numero;");
			operacion = teclado.nextLine();
			num1 = Integer.parseInt(operacion);
			System.out.println("Ingresa el segundo numero:");
			operacion = teclado.nextLine();
			num2 = Integer.parseInt(operacion);
			resultado = num1 + num2;
			System.out.println("El resultado de la suma es;" + resultado);
		}
		if(operacion.equals("Resta")){
			System.out.println("aqui haremos una resta");
			System.out.println("Ingresa el primer numero;");
			operacion = teclado.nextLine();
			num1 = Integer.parseInt(operacion);
			System.out.println("Ingresa el segundo numero:");
			num2 = Integer.parseInt(operacion);
			resultado = num1 - num2;
			System.out.println("El resultado de la resta es;" + resultado);

		}
		if(operacion.equals("Multiplicacion")){
			System.out.println("aqui haremos una multiplicacion");
			System.out.println("Ingresa el primer numero;");
			operacion = teclado.nextLine();
			num1 = Integer.parseInt(operacion);
			System.out.println("Ingresa el segundo numero:");
			num2 = Integer.parseInt(operacion);
			resultado = num1 * num2;
			System.out.println("El resultado de la multiplicacion es;" + resultado);
		

		
		}
		if(operacion.equals("Division")){
			System.out.println("aqui haremos una Division");
			System.out.println("Ingresa el primer numero;");
			operacion = teclado.nextLine();
			num1 = Integer.parseInt(operacion);
			System.out.println("Ingresa el segundo numero:");
			num2 = Integer.parseInt(operacion);
			resultado = num1 / num2;
			System.out.println("El resultado de la Division es;" + resultado);

		}
		

			}
		

			}