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
        if(this.isEmpty()&& posizione==0){
            this.aggiungiInTesta(dato);
            return;
        }
        while(posizioneCorrente<posizione-1&& posizioneCorrente.next!=null){
            carr=carr.next;
            posizioneCorrente++;
        }
        if(posizioneCorrente!=null){
            Nodo<T> x=new Nodo<>(dato);
            x.next=carr.next;
            carr.next=nodo;
        }else{
            throw newNoSuchElementEception("posizione");
        }
    }
    public  int LeggiInTesta(){
        if(head==null){
            throw newNoSuchElementEception("lista vuota");
        }
        retrn head.dato;
    }
    public int LeggiInCoda(){
        if(head==null){
            throw newNoSuchElementEception("lista vuota");
        }
        Nodo<T> currente=head;
        while(current,next!= null){
            currente=current.next;
        }
        return current.dato;
    } 
    public <T> LeggiInPosizione(int posizione){
        if(posizone<0){
            throw new IndexOf Bound Eception ("posizione negativa");
        }
        int contatorePos=0;
        Nodo<T> current=head;
        while(contatorePos-1 && current.next!=null){
            current=current.next();
            posizione++;
        }
        return current.dato;
    }
}
