import java.util.Scanner;
public class EXAM_P2_1S21_JRSA {

 public static void main(String[] args) {
  //definición  de variables 
  int valor [] = new int[100];
  int sumatoria = 0;
  int media = 0;
  Scanner entrada = new Scanner(System.in);
  
  System.out .println("Ingrese el valor de 4 numeros"
                                     +" como muestra");
  //petición de datos y sumatoria de todos
  for (int i = 0; i < 4; i++ ){
   
   System.out.print("Ingrese el valor " + (i + 1) + ":");
   valor[i] = entrada.nextInt();
   
   sumatoria = sumatoria + valor[i];
    
  }
  entrada.close();
  
  media = sumatoria / 4; 
  
  
  for(int i = 0 ; i < 4; i++){
   double rango;
   rango = Math.pow(valor[i] - media, 2f);
  }

  System.out.println("Media: " + media);
 }

}