
import java.util.Scanner;

public class Taller21260326 {

    public static void main(String[] args) {
        //prueba
        ListaEnlazada lis = new ListaEnlazada();
        lis.agregar(1);
        lis.agregar(2);
        lis.agregar(3);
        System.out.println(lis);
        
        
        Scanner scn = new Scanner (System.in);
        int n, m;
        System.out.println("Ingrese un numero entero");
        n=scn.nextInt();
        if (2<= n){
            //ListaEnlazada lis = new ListaEnlazada();
            System.out.println("Ingresa los numeros de la lista");
            System.out.println(lis);
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
