import java.util.Scanner

public class p2p12{
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int t,c;
		System.out.println("ingresa el numero de filas");
		f=teclado.nextInt();
		System.out.println("ingresa el numero de columnas");
		c=teclado.nextInt();
		Int[][] MA=new int [f][c];
		Int[][] MB=new int [f][c];
		Int[][] MC=new int [f][c];
		Int ff,fc;
		for (ff=0;ff<f;ff++){
			for(fc=0;fc<c;fc++){
				System.out.println("ingrese el valor para la posicion ["+ff+ff"]["+fc+"]");
				MA[ff][fc]=teclado.nextInt();

			}
		}
		for (ff=0;ff<f;ff++){
			for(fc=0;fc<c;fc++){
				System.out.println("ingrese el valor para la posicion ["+ff+ff"]["+fc+"]");
				MB[ff][fc]=teclado.nextInt();
			}

		}

		for (ff=0;ff<f;ff++){
			for(fc=0;fc<c;fc++){
				System.out.println("ingrese el valor para la posicion ["+ff+ff"]["+fc+"]");
				MC[ff][fc]=teclado.nextInt();
			}
		}
		for (ff=0;ff<f;ff++){
			for(fc=0;fc<c;fc++){
				System.out.println("el resultado de la suma de la matriz en posicion["+ff+"]["+fc*"]es"+ MC[ff][fc]);MA[ff][fc]=teclado.nextInt();
			}
		}

	}
}