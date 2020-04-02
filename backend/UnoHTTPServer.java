//UnoHTTPServer.java

/**
 * @author Manuel Barusco, Nicola Marigo, Francesco Corso
*/

import java.util.Vector;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.InetAddress;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.Headers;

public class UnoHTTPServer{
	private HttpServer server;
	private Vector<String> players;

	private class Handler implements HttpHandler{
		/** metodo handle generico, riceve una richiesta post e stampa i parametri
		@param e oggetto di classe HttpExchange che rappresenta la richiesta
		*/
		public void handle(HttpExchange e){
			System.out.println("Nuova richiesta arrivata");
			String requestParamValue=null;
			if(e.getRequestMethod().equalsIgnoreCase("POST"))
				requestParamValue=handlePostRequest(e);
			handleResponse(e,requestParamValue);
		} //handle

		/** metodo handlePostRequest
		@param e e oggetto di classe HttpExchange che rappresenta la richiesta
		@return stringa con i parametri passati tramite post
		*/
		public String handlePostRequest(HttpExchange e){
			InputStreamReader isr=null;
			try{
				isr =  new InputStreamReader(e.getRequestBody(),"utf-8");
			} catch (IOException exc){
				System.out.println(exc);
			} //try-catch
			Scanner br = new Scanner(isr);
			String value = br.nextLine();
			return value;
		} //handlePostRequest

		/** metodo handleResponse
		@param e oggetto di classe HttpExchange
		@param rPV stringa contenente i parametri della richiesta
		*/
		public void handleResponse(HttpExchange e, String rPV){
			Headers headers = e.getResponseHeaders();
			headers.add("Access-Control-Allow-Headers","x-prototype-version,x-requested-with");
			headers.add("Access-Control-Allow-Methods","GET,POST");
			headers.add("Access-Control-Allow-Origin","*");
			System.out.println(rPV);
			OutputStream os;
			try{
				e.sendResponseHeaders(200, rPV.length());
				os = e.getResponseBody();
				os.write(rPV.getBytes());
				os.close();
			} catch (IOException exc){
				System.out.println(exc);
			} //try-catch
		} //handleResponse
	} //Handler

	private class NewPlayerHandler extends Handler{
		/** costuttore di default */
		public NewPlayerHandler(){
			super();
		} //NewPlayerHandler

		/** metodo handle
		@param e oggetto di classe HttpExchange che rappresenta la richiesta di nuova partita
		*/
		public void handle(HttpExchange e){
			System.out.println("Richiesta di nuovo giocatore");
			String playerName=null;
			if(e.getRequestMethod().equalsIgnoreCase("POST")){
				String request =super.handlePostRequest(e);
				String[] rSplit=request.split("=");
				if(rSplit.length==2)
					playerName=rSplit[1];
			} //if
			System.out.println("Giocatore:"+playerName);
			if(players.size()+1>10)
				super.handleResponse(e,"Server pieno");
			if(playerName==null || playerName.isEmpty() || players.contains(playerName))
				super.handleResponse(e,"false");
			else if(playerName!=null && !players.contains(playerName)){
					super.handleResponse(e,"true");
					System.out.println(playerName);
					players.add(playerName);
			} //else
		} //handle
	} //NewPlayerHandler

	private class ActionPlayerHandler extends Handler{
		/** costuttore di default */
		public ActionPlayerHandler(){
			super();
		} //NewPlayerHandler

		/** metodo handle
		@param e oggetto di classe HttpExchange che rappresenta la richiesta di nuova partita
		*/
		public void handle(HttpExchange e){
			System.out.println("Nuova azione del giocatore");
			String requestParamValue=null;
			if(e.getRequestMethod().equalsIgnoreCase("POST"))
				requestParamValue=super.handlePostRequest(e);
			super.handleResponse(e,requestParamValue);
		} //handle
	} //ActionPlayerHandler

	/** costruttore
	@param add oggetto di classe InetSocketAddress per specificare la porta di ascolo del server
	*/
	public UnoHTTPServer(InetSocketAddress add){
		try{
			server=HttpServer.create(add,0);
		} catch (IOException e){
			System.out.println(e);
		} //try-catch
		server.createContext("/start", new NewPlayerHandler());
		server.setExecutor(null);
		server.start();
		players=new Vector<String>();
		System.out.println("Server avviato sull'indirizzo"+add+" pronto ad una nuova partita...");
		server.stop(300); //il server rimane in attesa dei giocatori per 3 minuti
	} //UnoHTTPServer

	public static void main(String[] args){
		UnoHTTPServer s=new UnoHTTPServer(new InetSocketAddress(8000));
	}

} //UnoHTTPServer
