<?php
require_once("Classes/Compte.php");

// on instancie la classe
$compte1 = new Compte("Emmanuel", 300);

echo $compte1->getTitulaire().'<br/>';

echo "Le taux d'interêt du compte est : ".compte::TAUX_INTERETS." euros.<br/>";
// var_dump($compte1);