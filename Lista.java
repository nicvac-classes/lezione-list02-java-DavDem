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
        if(current!=null){
            return current,dato;
        }else{
            throw new IndexOfBound Eception("posizione negativa");
        }
    }
    public int size(){
        Nodo<T> currente=head;
        int n=0;
        while(current!=null){
            ++n;
            current=current.next();
        }
        return n;
    }
    public boolean contains(T elemento){
        Nodo <T>current=head;
        if(head==null){
            throw new NoSuchElementEception("lista vuota");
        }
        while(curr!=null){
            if(current.dato.equals(elemento)){
                return true;
            }
            current=current.next();
        }
        return false;
    }
    public int indiceDi(T elemento){
        Nodo<T> current=null;
        int indice=0;
        while(current!=null){
            if(current.dato.equals(elemento)){
                return indice;
            }
            ++indice;
            curr=current.next();
        }
        return indice;
    }
    public boolean cancella(T dato) {
        if (head == null) {
            return false;
        }
        
        if (head.dato.equals(dato)) {
            head = head.next;
            return true;
        }
        
        Nodo<T> precedente = head;
        Nodo<T> corrente = head.next;
        
        while (corrente != null) {
            if (corrente.dato.equals(dato)) {
                precedente.next = corrente.next;
                return true;
            }
            precedente = corrente;
            corrente = corrente.next;
        }
        
        return false;
    }
    Public T cancellaP(int pos){
        if(head==null){
            throw new IndexOfBound Eception("lista vuota o posizione engativa");
        }
        if(pos==0){
            head=head.dato;
            return dato;
        }
        Nodo<T> prec=head;
        Nodo<T> curr=head.next;
        int e=1;
        while(curr!=null){
            if(e==pos){
                T dato=dato;
                prec.next==curr.next;
                return dato;
            }
            ++è;
        }
        throw new IndexOfBound("posizione non trovata");
    }
    public void Concatena(List<T> lista){
        Nodo<T> curr=head;
        if(this.head=null){
            this.head=list.head;
        }
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=lista.head;
    }
    public String ToString(){
        if(head==null){
            trow 

        }
        Nodo<T> curr=head;
        string a;
        while(curr!=null){
             a=curr,dato +"==>"
        }
        a=null;
        return a;
    }

}
