/**

	@author Nicola Marigo, Manuel Barusco, Francesco Corso


*/

import java.util.Vector;

public class TavoloGioco{
    
    private Vector<Giocatore> giocatori; //vettore contente i giocatori della partita
    private Mazzo mazzo;                 //mazzo centrotavolo
    
    /** csotruttore completo
    */
    public TavoloGioco(){
        
    }//TavoloGioco - Costruttore
    
    /** costruttore di copia
        @param t tavolo da gioco da cui copiare
    */
    public TavoloGioco(TavoloGioco t){
        
    }//TavoloGioco - Costruttore copia
    
    /** costruttore di copia
        @return vettore contente i giocatori
    */
    public Vector<Giocatore> getGiocatori(){
        return giocatori;
    }//getGiocatori
    
    
    /**
        @param g giocatore da aggiungere
    */
    public void addGiocatore(Giocatore g){
        giocatori.add(g);
    }//addGiocatore
    
    /** 
        @param id enumeratore del giocatore da rimuovere
    */
    public void removeGiocatore(int id){
        giocatori.remove(id);
        //probabilmente va segnalato al server
    }//removeGiocatore
    
    /** costruttore di copia
        @return mazzo centrotavolo corrente
    */
    public Mazzo getMazzo(){
        return mazzo;
    }//getMazzo
    
    public void setMazzo(Mazzo m){
        mazzo = m;
    }//setMazzo
    
}//TavoloGioco - classe