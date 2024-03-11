<?php
if (isset($_POST["submit"])) {
    $nome = $_POST["nome"];
    $cognome = $_POST["cognome"];
    $citta = $_POST["citta"];
    $abbonato = $_POST["abbonato"];

    if ($abbonato !== "si") {
        echo "<p>Messaggio: Non sei un abbonato!</p>";
    } else {
        echo "<p>Messaggio: Benvenuto, $nome $cognome da $citta. Grazie per essere un abbonato!</p>";
    }
}
?>
