<?php

$name   = $_FILES['image']['name']; // NOM
$type   = $_FILES['image']['type']; // TYPE
$size   = $_FILES['image']['size']; // SIZE 
$error  = $_FILES['image']['error']; // ERREUR
$tmp_name   = $_FILES['image']['tmp_name']; // EMPLACEMENT 

if (isset($_FILES['image']) && $error == 0) {
    // Vérifie que le fichier ne dépasse pas 3Mo
    if ($size <= 3000000) {
        // Récupère toutes les infos sur le fichier envoyé
        $infoImage = pathinfo($name);
        $extImage = $infoImage['extension'];
        $extArray = array('png', 'gif', 'jpg', 'jpeg');
        if (in_array($extImage, $extArray)) {
            // Déplace le fichier en le renommant
            move_uploaded_file($tmp_name, 'upload/' . time() . '_' . rand() . '_' . rand() . '.' . $extImage);
            echo 'Envoi réussi';
        }
    }
}

echo '<form method="post" action="index.php" enctype="multipart/form-data">
            <p>
                <h1>Formulaire</h1>
                <input type="file" name="image"></br>
                <button type="submit">Envoyer</button>
            </p>
        </form>';