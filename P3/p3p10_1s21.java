import java.util.Scanner;
public class p3p10_1s21 {

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        double factorial;
         int x;
         System.out.print("Introduce un número: ");
         x=teclado.nextInt();
         factorial=1;
       
         for (int i=x;i>0;i--) {

         factorial=factorial*i;

         }
         return x;

    }
    public static int alcubo(int i){
        int ac=1;
        for (int c=0;c<3;c++){
            ac*=i;
        }

        return ac;
    }
    int x;
    int ac;
    int c;
    c = x+ac;
    System.out.print("el resultado es = " + c);

}