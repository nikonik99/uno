# Progetto gioco Uno

## Frontend:
* pagina di login con il nome utente
* pagina principale, con il tavolo da gioco, le proprie carte e l’ultima carta lasciata sul tavolo e il mazzo. Possibilità di scegliere la carta da buttare con controllo della carta che possa essere giocata, pulsante termina turno dopo che si ha finito di lasciare le carte possibili che si hanno in mano. Possibilità di pescare cliccando sul mazzo se non si può fare niente. Tasto “Uno” che deve essere cliccato quando manca una carta altrimenti vengono aggiunte due carte a quelle del giocatore.
* pagina finale, proclamazione del vincitore e possibilità di iniziare un altra partita. 

## Backend:
* Classi per la gestione del gioco, Classe carta astratta,  da cui derivano le classi CartaNormale che hanno un colore e un numero e CartaSpeciale che può essere un cambia colore, +4, +2, stop, cambio giro. 
* Classe Mazzo, array di carte.
* Classe Giocatore che ha un  array di carte, un nome 
* Classe TavoloGioco, possiede un VETTORE di giocatori, e un mazzo con le carte rimanenti, e l’ultima carta buttata. Il tavolo da gioco all’inizio deve essere inizializzato e quindi va equilibrato il numero di carte per giocatore. Gestisce il turno dei giocatori e controlla le giocate fatte dal giocatore 
* Creazione della classe custom di HTTPServer, per la gestione delle richieste, con handler per gestire le richieste POST. Gestisce i turni e invia le varie giocate al tavolo da gioco. 
* Backdoor di accesso per cambiare i valori delle carte di chi ha fatto l’accesso con alcune del mazzo.
