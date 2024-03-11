<?php

if(isset($_POST['submit']))
{
    $nome = $_POST['nome'];
    $cognome = $_POST['cognome'];
    $sesso = $_POST['sesso'];
    $ateneo = $_POST['ateneo'];
    $cap = $_POST['CAP'];
    $lavoro = $_POST['lavoro'];
    $area = $_POST['area'];

    echo "nome: ".$nome;
    echo "<br><br>cognome: ".$cognome;
    echo "<br><br>sesso: ".$sesso;
    echo "<br><br>studente del ".$ateneo;
    echo "<br><br>CAP: ".$cap;
    echo "<br><br>lavaro: ";
    for($i=0; $i<count($lavoro); $i++)
    {
        echo $lavoro[$i].", ";
    }
    echo "<br><br>descrizione lavoro: ".$area;
}
else
{
    echo"errore";
}

?>