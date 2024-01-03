import java.util.Scanner;

public class P3P2_1s21 {
 
 public static void main(String args[]){


  Scanner entrada = new Scanner(System.in);
  
  double numero1, numero2, resultado = 0;
 
  int opcion = 0;
  

  while(true){
   
   System.out.println("Calculadora");
   System.out.println("Que operacion desea realizar?");
   System.out.println("1.-Suma");
   System.out.println("2.-Resta");
   System.out.println("3.-Multiplicacion");
   System.out.println("4.-Division");
   System.out.println("5.-Salir");
   System.out.print("Introduzca opcion: ");

   opcion = entrada.nextInt();
   
   switch(opcion){
   
    case 1:
     System.out.println("Suma");
     System.out.print("Introduce primer operando: ");
     numero1 = entrada.nextDouble();
     System.out.print("Introduce segund operando: ");
     numero2 = entrada.nextDouble();
     resultado = numero1 + numero2;
    break;
    
    case 2:
     System.out.println("Resta");
     System.out.print("Introduce primer operando: ");
     numero1 = entrada.nextDouble();
     System.out.print("Introduce segund operando: ");
     numero2 = entrada.nextDouble();
     resultado = numero1 - numero2;
    break;
    
    case 3:
     System.out.println("Multiplicacion");
     System.out.print("Introduce primer operando: ");
     numero1 = entrada.nextDouble();
     System.out.print("Introduce segund operando: ");
     numero2 = entrada.nextDouble();
     resultado = numero1 * numero2;
    break;

    case 4:
     System.out.println("Division");
     System.out.print("Introduce primer operando: ");
     numero1 = entrada.nextDouble();
     System.out.print("Introduce segund operando: ");
     numero2 = entrada.nextDouble();
     resultado = numero1 / numero2;
    break;
  
    case 5:
    
     System.exit(0);
    break;
   
    default:
     System.out.println("Opcion no valida");
     resultado = 0;
   }
  
   System.out.println("El resultado es: " + resultado);
  }
  
 }