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
        while(corrente.next!=null){
            corrente=corrente.next;
        }
        corrente.next=nodo;
    }
    public void AggiungiInPosizione(T dato,int posizione){
        Nodo<T> carr=this.head;
        int posizioneCorrente=0;
        while(posizioneCorrente<posizione-1){
            carr=carr.next;
            posizioneCorrente++;
        }
        Nodo<T> x=new Nodo<>(dato);
        x.next=carr.next;
        carr.next=nodo;
    }
}
