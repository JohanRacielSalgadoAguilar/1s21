import java.until.Scanner;
public class P8_1S21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		byte edad;
		System.out.println("ingrese su edad: ");
		edad = teclado.nextByte();
		if(edad >= 18){
			System.out.println("eres mayor de edad...");
		}
	}
}