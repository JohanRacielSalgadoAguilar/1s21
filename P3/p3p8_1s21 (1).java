import java.util.Scanner;

public class p3p8_1s21{

    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);

        int n,f=0;
        int t1=1;
        int t2;
        System.out.println("Cuantos números de la serie quiere generar?");
        n=scaner.nextInt();
        for(int i=0;i<= n;i++)
        {
            t2=f;
            f=t1+f;
            t1=t2;

            System.out.println(+t1);
        }
    }

}