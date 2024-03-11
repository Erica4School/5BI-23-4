<?php
// parametri per la connessione al database
$host = "127.0.0.1";  
$username = "root";  
$password = "";  
$db_nome = "ordini";

// connessione al server  
$conn = new mysqli($host, $username, $password, $db_nome);     
if ($conn->connect_errno) {        
    echo "Impossibile connettersi al server:  " . $conn->connect_error . "\n";       
    exit;     
} 

// Prende il nome dello studente dal form
$nome = $_POST["nome"];

// Cerca la media dei voti dello studente nel database
$query = "SELECT AVG(eta) as media FROM clienti WHERE nome = '$nome'";
$result = $conn->query($query);

$row = $result->fetch_assoc();
if ($row !== null) {
    // Stampa la media dei voti dello studente
    echo "La media dei voti di $nome è " . $row["media"];
} else {
    // Stampa un messaggio di errore se lo studente non esiste
    echo "Lo studente $nome non esiste";
}


$conn->close();
?>
