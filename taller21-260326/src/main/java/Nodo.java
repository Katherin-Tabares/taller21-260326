
public class Nodo {
    private int dato;
    private Nodo siguiente;
    
    public Nodo(){}
    public Nodo (int dato){
        this.dato = dato;
    }
    public int getDato(){
        return dato;
    }
    public void setDato (int dato){
        this.dato = dato;
    }
    
    @Override
    public String toString(){
        return dato + " ";
    }
    
}
