$(document).ready(function(){
    var serverAddr = "127.0.0.1:8080";
    var username = "";
    var myTurn = false;
    var turnTimer = setInterval(function(){
        $.post(serverAddr, {uname : username}, function(result){
           var JResult = JSON.parse(result);
           if(JResult.turn){
               myTurn = true;
               //turno dell'utente corrente, genero le carte e metto in pausa il turnTimer aspettando un azione del giocatore per continuare
               myTurn= false;
           }else{
               //turno di un altro giocatore, ottengo il nome del giocatore e il suo numero di carte per aggiornare la tabella .opponent, il processo continua a controllare se è il suo turno ogni 100 ms
           }
        });
    }, 100);
    $("#turn-end").click(function(){
        var action = "turn-close";
       if(myTurn){
           $.post(serverAddr, {uname: username, action: action}, function(result){
               //risultato della richiesta
           });
       } 
    });
    
    $("#draw-end").click(function(){
        var action = "turn-close-draw";
       if(myTurn){
           $.post(serverAddr, {uname: username, action: action}, function(result){
               //risultato della richiesta
           });
       } 
    });
    
    $(".game-card").click(function(){
        var action "pick-card";
        var selection = "" //da ottenere colore e valore della carta selezionata
       if(myTurn){
           $.post(serverAddr, {uname: username, action: action, selection: selection}, function(result){
               //risultato della richiesta
           });
       } 
    });
});