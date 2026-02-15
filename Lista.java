public class Lista<T> {
    private Nodo<T> head;

    public Lista() {
        this.head = null;
    }
    publiv void aggiungiInTesta(T dato ){
        Nodo<T> nodo = new Nodo<>(dato);
        Nodo.next=head;
        head=nodo;
    }
    public bolean isEmpty(){
        if(head==null){
            return true;
        }else{
            return false;
        }
    }
    public void AggiungiInCoda(T dato){
        Nodo<T> nodo=new Nodo<>(dato);
        Nodo<T> corrente=this.head;
        if(corrente==null){
            thid.head=nodo;
        }
        while(corrente,next!=null){
            corrente?corrente.next;
        }
    }
}
