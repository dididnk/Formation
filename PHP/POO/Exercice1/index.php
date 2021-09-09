<?php
require_once("Classes/Comptes.php");

// on instancie la classe
$compte1 = new Comptes("Emmanuel", 300);

// on écrit dans la propriété titulaire
// $compte1->titulaire = 'Christelle';

// on écrit dans la propriété solde
// $compte1->solde  = 5000;

?>
<p><?= $compte1->voirSolde() ?></p>;
<?php

// on depose 200 euros
$compte1->deposer(200);
?>
<p><?= $compte1->voirSolde() ?></p>;
<?php
// on depose un montant invalide
$compte1->deposer(-50);

?>
<p><?= $compte1->voirSolde() ?></p>;
<?php
// on retire 450
$compte1->retirer(450);

?>
<p><?= $compte1->voirSolde() ?></p>;
<?php
// on retire un montant invalide
$compte1->retirer(8000);
?>
<p><?= $compte1->voirSolde() ?></p>;
<?php

$compte2 = new Comptes("Distingué");

var_dump($compte1);