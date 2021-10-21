<?php
use App\client\Compte as CompteClient;
require_once("Classes/Banque/Compte.php");
require_once("Classes/Banque/CompteCourant.php");
require_once("Classes/Banque/CompteEpargne.php");
require_once("Classes/Banque/CompteEpargneCourant.php");
require_once("classes/Client/Compte.php");

// on instancie la classe
$compte1 = new CompteCourant("Emmanuel", 200, 200);
$compte1->retirer(399.9);

$compteEpargene = new CompteEpargne("Emmanuel", 200, 10);
var_dump($compte1);

$compteEpargene = new CompteEpargneCourant("Emmanuel", 200, 10, 200);

$compteEpargene->verserInteret();
$compteEpargene->retirer(300);
var_dump($compteEpargene);