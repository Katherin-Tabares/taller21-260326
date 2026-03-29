
import java.util.Scanner;

public class Taller21260326 {

    public static void main(String[] args) {
        
        ListaEnlazada lis = new ListaEnlazada();
        
        Scanner scn = new Scanner (System.in);
        int n, m;
        System.out.println("Ingrese un numero entero mayor o igual a 2");
        n=scn.nextInt();
        if (2<= n){
            System.out.println("Ingresa los numeros de la lista mayor que 1 y menor que " + n);
            for (int i=0; i<n-1; i++){
                m=scn.nextInt();
                if (m<=n && !lis.numFaltante(m)){
                    lis.agregar(m);
                }else{
                    System.out.println("Numero repetido o fuera de rango, ingrese otro");
                    i--;
                }
            }
        }
        System.out.println(lis); //muetra la lista
         //mostrar el faltante
        for(int i=1; i<=n; i++){
            if(!lis.numFaltante(i)){
                System.out.println("Numero faltante " + i);
            }
        }
        //codigo en texto pero sin indicaciones
        /*
        n=scn.nextInt();
        if (2<= n){
            for (int i=0; i<n-1; i++){
                m=scn.nextInt();
                if (m<=n && !lis.numFaltante(m)){
                    lis.agregar(m);
                }else{
                    i--;
                }
            }
        }
        System.out.println(lis);
        for(int i=1; i<=n; i++){
            if(!lis.numFaltante(i)){
                System.out.println(i);
            }
        }
        */
    }
}
