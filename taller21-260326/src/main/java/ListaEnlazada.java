
public class ListaEnlazada {
    private Nodo cabeza;
    private int tamanio;
    
    public ListaEnlazada (){}
    public void agregar (int dato){
        Nodo nuevo = new Nodo (dato);
        if (cabeza == null){
            cabeza = nuevo;
        }
        Nodo aux = cabeza;
        while (aux.getSiguiente() != null){
            aux = aux.getSiguiente();
            aux.setSiguiente(new Nodo (dato));
        }
    }
    @Override
    public String toString (){
        String str = "[";
        Nodo aux = cabeza;
        
        if (aux == null){
            return "Lista Vacia";
        }
        do{
            str += aux;
            aux = aux.getSiguiente();
            if (aux != null){
                str += ", ";
            }
        }while (aux != null);
        return str + "]";
    }
}
