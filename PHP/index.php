<!DOCTYPE html>
<html lang="fr">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Hébergeur d'images Gratuit</title>
    </head>
    <style type="text/css">
        html,
        body {
            margin: 0;
            font-family: georgia, sans-serif;
        }

        header {
            text-align: center;
            background: crimson;
            color: #fff;
        }
        article{background: #f7f7f7;}
    </style>

    <body>
        <!-- HEADER -->
        <header>
            <h2>PHOTOSHOOT</h2>
        </header>

        <div class="contener">
            <article>
                <h1>Hébergez une image</h1>
                <form method="post" action="index.php" enctype="multipart/form-data">
                    <p>
                        <input type="file" name="image">
                    </p>
                    <p>
                        <button type="submit">Envoyer</button>
                    </p>
                    
                </form>
            </article>
        </div>
    </body>

</html>