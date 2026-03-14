//LEGGERE LE ISTRUZIONI NEL FILE README.md


//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;




// Classe principale, con metodo mainù
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        //Variabili del programma
        String nome;

        //Creo l'oggetto in per l'input da tastiera
        Scanner in = new Scanner( System.in );


        //Leggo l'input da tastiera
        System.out.print("Inserisci il tuo nome: ");
        nome = in.nextLine();

        //Output del nome acquisito da tastiera
        System.out.println("Ciao "+nome+"!");
        Nodo<Integer>=new Nodo<>(4);
        Lista<Integer>=new Lista<>()
        Lista.AggiungiInCoda("A");
        Lista.AggiungiInCoda("B");
        Lista.AggiungiInCoda("C");
        if(ListInt.IsEmpty){
            System.out.println("è vuota");
        }
        System.out.println("inserisci la nuova posizione e l'elemento");
        int posizione=Integer.parseInt(in.nextLine());
        int elemento=Integer.parseInt(in.nextLine());
        Lista=AggiungiInPosizione(posizione,elemento);
        

    }
}


//LEGGERE LE ISTRUZIONI NEL FILE README.md