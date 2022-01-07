package ex2016.a01.t2.e2;

public class Test {

    /*
     * Scopo di questo esercizio è realizzare una GUI con l'aspetto mostrato nell'immagine gui.png fornita, con 
     * un costruttore che prende in ingresso un nome di file DI TESTO.
     * Premendo i pulsanti INCINC, RAND e UNO, vengono generati dei numeri che la GUI memorizza.
     * SOLO alla pressione del pulsante OK vengono scritti in sequenza (uno per linea) su Console e sul file.
     * In particolare:
     * - INCINC genera numeri via via crescenti di 2 (ossia, 2, 4, 6, 8, ..)
     * - RAND genera numeri casuali (compresi fra -1 e -100)
     * - UNO genera degli 1
     * 
     * Ad esempio, premendo la sequenza INCINC,INCINC,RAND,RAND,UNO,UNO,INCINC,OK, si stamperà (su console e file) la
     * sequenza: 2, 4, -25, -90, 1, 1, 6
     * 
     * Dopo la pression di OK la GUI non si chiude, ma si reinizializza e funziona come all'avvio.
     * 
     * Per la scrittura su file si può usare, ad esempio (ma non solo) BufferedWriter che decora FileWriter.
     * 
     * Sono considerati opzionali ai fini della possibilità di correggere l'esercizio, ma concorrono comunque al raggiungimento 
     * della totalità del punteggio:
     * - scorporamento di tutti gli aspetti che non sono di view in una interfaccia+classe esterna, via Strategy
     * - effettiva scrittura su file
     * - compilazione e esecuzione dell'esempio da linea di comando
     * 
     * La classe GUI fornita come punto di partenza già contiene in minima parte del codice utile e eventualmente riusabile. 
     * 
     */

    public static void main(String[] args) throws java.io.IOException {
        new GUI("a.txt"); // Si noti che questo file sarà scritto nella cartella "root" del progetto, a fianco src e bin 
    }
}
