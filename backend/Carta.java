/**
	
	@author Nicola Marigo, Manuel Barusco, Francesco Corso
	
	
*/

public abstract class Carta{
	
	private String colore
	
	/** costruttore completo
	 *  @param v valore della carta
	 *  @param c colore della carta
	 */
	public abstract Carta(int v, String c);
	
	/** costruttore di copia
 	 *  @param c Carta da cui copiare
	 */
	public abstract Carta(Carta c);
	
	/** setV
	 * @param v valore da assegnare alla carta
	 */
	public abstract setV(int v);
	
	/** getC
	 * @param c colore da assegnare alla carta
	 */
	public void setC(String c){
		colore = c;
	}
	
	/** getV
	 * @return v valore della carta corrente 
	 */
	public abstract int getV();
	
	/**
	 * @return c colore della carta corrente
	 */
	public int getC(){
		return colore;
	}
	
}
