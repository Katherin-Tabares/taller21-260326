
import java.util.Scanner;

public class Taller21260326 {

    public static void main(String[] args) {
        
        ListaEnlazada lis = new ListaEnlazada();
        
        Scanner scn = new Scanner (System.in);
        int n, m;
        System.out.println("Ingrese un numero entero mayor de 2");
        n=scn.nextInt();
        if (2<= n){
            System.out.println("Ingresa los numeros de la lista");
            for (int i=0; i<n; i++){
                m=scn.nextInt();
                if (m<=n){
                    lis.agregar(m);
                }else{
                    i--;
                }
            }
            System.out.println(lis); //muetra la lista
        }
    }
}
