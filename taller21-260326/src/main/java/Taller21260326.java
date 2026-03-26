
import java.util.Scanner;

public class Taller21260326 {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n, m;
        System.out.println("Ingrese un numero entero");
        n=scn.nextInt();
        if (2<= n){
            ListaEnlazada lis = new ListaEnlazada();
            System.out.println("Ingresa los numeros de la lista");
            for (int i=0; i<=n-1; i++){
                m=scn.nextInt();
                if (m>n){
                    i--;
                }else{
                    lis.agregar(m);
                }
            }
            System.out.println(lis); //muetra la lista
        }
    }
}
