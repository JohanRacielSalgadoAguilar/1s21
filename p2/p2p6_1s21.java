public class P6_1S21_P2º{
	public static void main(String[] args) {
		char opc;
		int a=1;
		do{
			System.out.println("aqui nos repetimos");
			a++;
		}while(a<10);

		a=10;
		do{
			System.out.println("acaso se ejecutara esta linea");
			a++;
		}while(a<10);

		do{
			System.out.println("Presiona s para salir: ");
			opc = teclado.next().charAt(0);
		}while(opc != ´s´);	
	}	
}