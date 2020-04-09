/**

	@author Nicola Marigo, Manuel Barusco, Francesco Corso


*/

import java.util.Vector;

public class Giocatore{
    
    private String n;   //nome giocatore
    private Vector<Carta> c;  //carte del mazzo del giocatore
    
    /** costruttore completo
        @param nome nickname del giocatore
        @param carte vettore contenente le carte del giocatore
    */
    public Giocatore(String nome, Vector<Carta> carte){
       n = nome;
       c = carte;
    }
    
    /** costruttore di copia
        @param g giocatore da cui copiare
    */
    public Giocatore(Giocatore g){
        n = g.getNome();
        c = g.getCarte();
    }
    
    /** getNome
        @return n nome del giocatore
    */
    public String getNome(){
        return n;
    }
    
    /** getCarte
        @return c carte del giocatore
    */
    public Vector<Carta> getCarte(){
        return c;
    }
    
    /** setNome
        @param nome nickname del giocatore da impostare
    */
    public void setNome(String nome){
        n = nome;
    }
    
    /** setCarte
        @param carta vettore di carte da asseggnare al giocatore
    */
    public void setCarte(Vector<Carta> carte){
        c = carte;
    }

}